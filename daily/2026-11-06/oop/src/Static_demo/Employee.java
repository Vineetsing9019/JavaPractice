// Learning oop (Static demo) - practice file from oop, pushed 2026-11-06
package Static_demo;

public class Employee {
	int id;
	public  String name, email;
	int salary; // package / default
	private String pasword;
	static String CompanyName="goedrej";
	
	Employee(){
	}
	
		Employee(int id , String name , String email, int salary, String password, String companyName){
		
		this.id=id;
		 this.name= name;
		 this.email=email;
		this.salary=salary; // package / default
		this.pasword=password;
		this.CompanyName=CompanyName;
	}
	public  static void main (String[] args) {
		Employee e = new Employee();
		System.out.println(e.name);
		System.out.println(e.salary);
		
		System.out.println(CompanyName); //we dont need object to acess the static
		showRules()// no need of object
	}

}
}


