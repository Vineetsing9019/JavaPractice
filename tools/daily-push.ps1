# Daily push: copies one not-yet-pushed Java file into JavaPractice and pushes it.
# Run by the Windows scheduled task "JavaPractice daily push". Use -DryRun to test without committing.
param([switch]$DryRun)

$ErrorActionPreference = 'Stop'
$Repo    = 'D:\Practice'
$Log     = Join-Path $Repo 'tools\daily-push.log'
$Pushed  = Join-Path $Repo 'daily\pushed.txt'
$Sources = @(
    'C:\Users\Vineet\OneDrive\Desktop\beginjava',
    'C:\Users\Vineet\Downloads\Spring_Projects'
)
$Skip    = @('\target\', '\PetHaven\', '\ProductCrudd\', 'module-info.java', '\bin\')
$Secrets = @('Vinyy@2004')

function Log($msg) {
    $line = "{0:yyyy-MM-dd HH:mm:ss}  {1}" -f (Get-Date), $msg
    Add-Content -Path $Log -Value $line -Encoding utf8
    Write-Host $line
}

try {
    Set-Location $Repo
    $today = Get-Date -Format 'yyyy-MM-dd'
    if (-not (Test-Path (Split-Path $Pushed))) { New-Item -ItemType Directory -Path (Split-Path $Pushed) | Out-Null }
    if (-not (Test-Path $Pushed)) { New-Item -ItemType File -Path $Pushed | Out-Null }
    $done = @(Get-Content $Pushed -ErrorAction SilentlyContinue)

    if (($done | Where-Object { $_ -like "$today|*" }) -and -not $DryRun) {
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
    foreach ($s in $Sources) { if ($rel.StartsWith($s)) { $rel = $rel.Substring($s.Length).TrimStart('\') } }
    $dest = Join-Path $Repo ("daily\$today\" + $rel)
    New-Item -ItemType Directory -Path (Split-Path $dest) -Force | Out-Null

    $content = Get-Content $pick.FullName -Raw
    foreach ($sec in $Secrets) { $content = $content.Replace($sec, '<password>') }
    Set-Content -Path $dest -Value $content -Encoding utf8
    Log "Picked $($pick.FullName) -> $dest"

    # README row
    $readme = Join-Path $Repo 'README.md'
    $relDest = "daily/$today/" + $rel.Replace([char]92, '/')
    Add-Content -Path $readme -Value ("| $today | [{0}]({1}) | daily file from {2} |" -f $pick.Name, $relDest, (Split-Path $rel -Parent)) -Encoding utf8
    Add-Content -Path $Pushed -Value "$today|$($pick.FullName)" -Encoding utf8

    if ($DryRun) { Log "Dry run: staged files below, not committing."; git status --short; exit 0 }

    git pull --rebase --quiet origin main
    git add -A
    git commit --quiet -m "Daily push: $($pick.Name)" -m "From $rel"
    git push --quiet origin main
    Log "Pushed $($pick.Name)"
}
catch {
    Log "FAILED: $($_.Exception.Message)"
    exit 1
}
