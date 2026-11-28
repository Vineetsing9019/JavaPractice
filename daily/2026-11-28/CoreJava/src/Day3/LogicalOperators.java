// Learning core java (day 3) - practice file from CoreJava, pushed 2026-11-28
package Day3;

public class LogicalOperators {

	public static void main(String[] args) {
		int age = 18;
		boolean hasTicket = false;

		System.out.println(" AND: " + (age >= 18 && hasTicket));
		System.out.println(" OR : " + (age >= 18 || hasTicket));
		System.out.println(" NOT: " + (!hasTicket));

		int marks = 45;
		System.out.println(" PASS but below 50: " + (marks >= 35 && marks < 50));
	}
}
