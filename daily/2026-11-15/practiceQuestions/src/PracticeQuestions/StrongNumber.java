// Learning practice questions - practice file from practiceQuestions, pushed 2026-11-15
package PracticeQuestions;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int temp = num;
		int sum = 0;

		while (temp > 0) {
			int digit = temp % 10;

			// factorial of the digit
			int fact = 1;
			for (int i = 1; i <= digit; i++) {
				fact = fact * i;
			}

			sum = sum + fact;
			temp = temp / 10;
		}

		if (sum == num) {
			System.out.println(num + " is a Strong number");
		} else {
			System.out.println(num + " is not a Strong number");
		}

		sc.close();
	}
}

