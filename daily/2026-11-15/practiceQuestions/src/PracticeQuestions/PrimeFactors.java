// Learning practice questions - practice file from practiceQuestions, pushed 2026-11-15
package PracticeQuestions;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int temp = num;
		System.out.print("Prime factors of " + num + " are: ");

		for (int i = 2; i <= temp; i++) {
			while (temp % i == 0) {
				System.out.print(i + " ");
				temp = temp / i;
			}
		}

		sc.close();
	}
}

