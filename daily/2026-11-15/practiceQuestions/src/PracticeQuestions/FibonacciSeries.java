// Learning practice questions - practice file from practiceQuestions, pushed 2026-11-15
package PracticeQuestions;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of terms: ");
		int n = sc.nextInt();

		int a = 0;
		int b = 1;

		System.out.println("Fibonacci series up to " + n + " terms:");
		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}

		sc.close();
	}
}

