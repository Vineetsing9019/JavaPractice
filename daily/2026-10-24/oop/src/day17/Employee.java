// Learning oop (day 17) - practice file from oop, pushed 2026-10-24
package day17;

public class Employee {
	int id;
	public String name,email;
	private String password;
	 int salary;
	
	
	//acess modifiers: (instance variable, constructors, methods, classes)
	//public class is acessable to every class  --PUBLIC GARDEN
	//protected  same class and and other class in same package not in another  package , COZ OF RELATION- COMPLEX GARDEN
	//default / package is  only acessable in same package clases not to outside class - COMPLEX GARDEN
	//private not  acessible only in same class not also in same package  - PVT BUNGLOW GARDEN

	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name="vineet";
		System.out.println(e.name);
		
		e.salary=100000;
		System.out.println(e.salary);
		
		e.password="vineet@123";
		System.out.println(e.password);
	}
}

