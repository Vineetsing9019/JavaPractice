// Learning practice questions - practice file from practiceQuestions, pushed 2026-11-15
package PracticeQuestions;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		// count the digits
		int temp = num;
		int count = 0;
		while (temp > 0) {
			count++;
			temp = temp / 10;
		}

		// add each digit to the power of count
		temp = num;
		int sum = 0;
		while (temp > 0) {
			int digit = temp % 10;
			int power = 1;
			for (int i = 1; i <= count; i++) {
				power = power * digit;
			}
			sum = sum + power;
			temp = temp / 10;
		}

		if (sum == num) {
			System.out.println(num + " is an Armstrong number");
		} else {
			System.out.println(num + " is not an Armstrong number");
		}

		sc.close();
	}
}

