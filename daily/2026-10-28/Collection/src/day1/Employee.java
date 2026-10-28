// Learning the Collections framework (day 1) - practice file from Collection, pushed 2026-10-28
package day1;

public class Employee implements Comparable<Employee>
//we need compareTo() for sorting
//interface Comparable declares this abstract method copareTpo
{
	@Override
	public int compareTo(Employee emp) {
		//we have 2 objects- this,emp
		//return this.empId-emp.empId;
//		return this.salary-emp.salary;
		return this.name.compareTo(emp.name);
	}
	//POJO-plain old java object
	//model(data) class
	
	int empId,salary;
	String name,password;
	
	public Employee(){
		
	}
	public Employee(int empId,int salary,String name,String password) {
		this.empId=empId;
		this.name=name;
		this.password=password;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", name=" + name + ", password=" + password + "]";
	}
	

}

