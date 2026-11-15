// Learning practice questions - practice file from practiceQuestions, pushed 2026-11-15
package PracticeQuestions;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int temp = num;
		int product = 1;

		while (temp > 0) {
			int digit = temp % 10;
			product = product * digit;
			temp = temp / 10;
		}

		System.out.println("Product of digits of " + num + " = " + product);

		sc.close();
	}
}

