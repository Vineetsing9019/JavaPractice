// Learning core java (day 1) - practice file from CoreJava, pushed 2026-11-21
package Day1;

public class PrintPerson {
	public static void main (String[]args) {
		Person p = new Person("Vineetsing", 22, "7039376367", "Vinygirase@gmail.com");

		System.out.println(" MY Name is:" + p.name + "\n My age is: " + p.age + "\n My number is: " + p.number + "\n My email is:" + p.email);
	}

}

