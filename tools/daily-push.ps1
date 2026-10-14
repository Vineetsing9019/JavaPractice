# Daily push: copies one not-yet-pushed Java file into JavaPractice and pushes it with a learning note.
# Run by the Windows scheduled task "JavaPractice daily push". Use -DryRun to test without committing, -Force to push an extra file today.
param([switch]$DryRun, [switch]$Force)

$ErrorActionPreference = 'Stop'
$Repo    = 'D:\Practice'
$Log     = Join-Path $Repo 'tools\daily-push.log'
$Pushed  = Join-Path $Repo 'daily\pushed.txt'
$Sources = @(
    'C:\Users\Vineet\OneDrive\Desktop\beginjava',
    'C:\Users\Vineet\Downloads\Spring_Projects'
)
$Skip    = @('\target\', '\PetHaven\', '\ProductCrudd\', '\src\test\', 'module-info.java', '\bin\')
$Secrets = @('Vinyy@2004')
$BS      = [string][char]92

# Folder name -> topic the file is learning. Anything not listed is split from CamelCase.
$Topics = @{
    'introjava'          = 'Java basics'
    'ArrayDemos'         = 'arrays'
    'Collection'         = 'the Collections framework'
    'ExceptionHandling'  = 'exception handling'
    'Encapsulation'      = 'encapsulation'
    'ABSTRACTION'        = 'abstraction and interfaces'
    'Assignments'        = 'Java assignments'
    'Jdbc'               = 'JDBC'
    'EmployeeCrudJdbc'   = 'CRUD with JDBC'
    'PetCrudJdbc'        = 'CRUD with JDBC'
    'basics'             = 'Spring Boot basics'
    'BookManagement'     = 'Spring Data JPA'
    'OrmDemo'            = 'ORM with Hibernate and JPA'
    'PetAdoption'        = 'a Spring Boot REST project'
    'Relationship'       = 'JPA entity relationships'
    'SecurityDemo'       = 'Spring Security'
    'ShopKart'           = 'a Spring Boot e-commerce project'
    'UserValidation'     = 'bean validation in Spring'
    'UserSpringDataRestDemoUserValidation-1' = 'Spring Data REST with validation'
}
$Layers = @{
    'controller'   = 'REST controllers'; 'controllers' = 'REST controllers'
    'models'       = 'entity models';    'model'       = 'entity models'
    'repositories' = 'repositories';     'repository'  = 'repositories'
    'services'     = 'the service layer'; 'service'    = 'the service layer'
}

function Log($msg) {
    $line = "{0:yyyy-MM-dd HH:mm:ss}  {1}" -f (Get-Date), $msg
    Add-Content -Path $Log -Value $line -Encoding utf8
    Write-Host $line
}

function Get-Topic($rel) {
    $parts   = $rel.Split($BS)
    $project = $parts[0]
    $parent  = $parts[$parts.Length - 2]
    $topic   = $Topics[$project]
    if (-not $topic) { $topic = ($project -creplace '([a-z])([A-Z])', '$1 $2').ToLower() }
    $layer = $Layers[$parent]
    if ($layer) { $topic = "$layer in $topic" }
    elseif ($parent -match '^day(\d+)$') { $topic = "$topic (day $($Matches[1]))" }
    elseif ($parent -ne $project -and $parent -ne 'src' -and $parent -notmatch '^(main|java|com|itvedant)$') {
        $topic = "$topic ($($parent.Replace('_', ' ')))"
    }
    return $topic
}

try {
    Set-Location $Repo
    if (-not $DryRun) { git pull --rebase --quiet origin main }
    $today = Get-Date -Format 'yyyy-MM-dd'
    if (-not (Test-Path (Split-Path $Pushed))) { New-Item -ItemType Directory -Path (Split-Path $Pushed) | Out-Null }
    if (-not (Test-Path $Pushed)) { New-Item -ItemType File -Path $Pushed | Out-Null }
    $done = @(Get-Content $Pushed -ErrorAction SilentlyContinue)

    if (($done | Where-Object { $_ -like "$today|*" }) -and -not $DryRun -and -not $Force) {
        Log "Already pushed a file today; nothing to do."
        exit 0
    }

    # Candidates: every .java file under the sources that is not skipped and not pushed before.
    $candidates = foreach ($s in $Sources) {
        Get-ChildItem -Path $s -Recurse -Filter *.java -File | Where-Object {
            $p = $_.FullName
            -not ($Skip | Where-Object { $p -like "*$_*" }) -and
            -not ($done | Where-Object { $_.Split('|')[1] -eq $p })
        }
    }
    if (-not $candidates) { Log "No unpushed Java files left."; exit 0 }

    $pick = $candidates | Get-Random
    $rel  = $pick.FullName
    foreach ($s in $Sources) { if ($rel.StartsWith($s)) { $rel = $rel.Substring($s.Length).TrimStart($BS) } }
    $topic = Get-Topic $rel
    $dest  = Join-Path $Repo ("daily" + $BS + $today + $BS + $rel)
    New-Item -ItemType Directory -Path (Split-Path $dest) -Force | Out-Null

    $content = Get-Content $pick.FullName -Raw
    foreach ($sec in $Secrets) { $content = $content.Replace($sec, '<password>') }
    $header  = "// Learning $topic - practice file from $($rel.Split($BS)[0]), pushed $today`r`n"
    Set-Content -Path $dest -Value ($header + $content) -Encoding utf8
    Log "Picked $($pick.FullName) -> $dest  [$topic]"

    # README row
    $readme  = Join-Path $Repo 'README.md'
    $relDest = "daily/$today/" + $rel.Replace($BS, '/')
    Add-Content -Path $readme -Value ("| $today | [{0}]({1}) | Learning {2} |" -f $pick.Name, $relDest, $topic) -Encoding utf8
    Add-Content -Path $Pushed -Value "$today|$($pick.FullName)" -Encoding utf8

    if ($DryRun) { Log "Dry run: staged files below, not committing."; git status --short; exit 0 }

    git add -A
    git commit --quiet -m "Learning $topic`: $($pick.Name)" -m "Practice file from $rel. Learned this today while working through $topic."
    git push --quiet origin main
    Log "Pushed $($pick.Name)"
}
catch {
    Log "FAILED: $($_.Exception.Message)"
    exit 1
}
