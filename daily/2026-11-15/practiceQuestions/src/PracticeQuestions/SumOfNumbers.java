// Learning practice questions - practice file from practiceQuestions, pushed 2026-11-15
package PracticeQuestions;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter N: ");
		int n = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}

		System.out.println("Sum of numbers from 1 to " + n + " = " + sum);

		sc.close();
	}
}

