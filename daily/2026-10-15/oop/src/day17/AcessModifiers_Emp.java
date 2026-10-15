// Learning oop (day 17) - practice file from oop, pushed 2026-10-15
package day17;

public class AcessModifiers_Emp {
	int id;
	public String name,email;
	private String password;
	 int salary;

	
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

