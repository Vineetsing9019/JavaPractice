// Learning Java assignments (Assignment) - practice file from Assignments, pushed 2026-10-21
package Assignment;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		long fact = 1;

		for (int i = 1; i <= num; i++) {

			fact = fact * i;

		}

		System.out.println("Factorial = " + fact);

		sc.close();
	}
}

