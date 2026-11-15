// Learning practice questions - practice file from practiceQuestions, pushed 2026-11-15
package PracticeQuestions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int temp = num;
		int reverse = 0;

		while (temp > 0) {
			int digit = temp % 10;
			reverse = reverse * 10 + digit;
			temp = temp / 10;
		}

		System.out.println("Reverse of " + num + " = " + reverse);

		sc.close();
	}
}

