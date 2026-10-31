// Learning exception handling (day 2) - practice file from ExceptionHandling, pushed 2026-10-31
package day2;

import java.util.Scanner;

public class voter {
	
	String name;
	int age;
	
	public void register() throws InvalidAgeException{
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter name and age ");
		name =sc.next();
		age =sc.nextInt();
		if(age < 18) {
			throw new InvalidAgeException(" your age shouldbe min 18");
		}
		
	}
	public void vote() {
		System.out.println(name + " has voted sucessfully!!");
		
	}
	
	public static void main(String[] args) {
		voter v1 = new voter();
		try {
			v1.register();
			v1.vote(); 
	}
	catch(Exception e) {
		e.printStackTrace();
	}

}
}

class InvalidAgeException extends Exception {

	public InvalidAgeException(String string) {
		// TODO Auto-generated constructor stub
	}
	// checked exception
}




