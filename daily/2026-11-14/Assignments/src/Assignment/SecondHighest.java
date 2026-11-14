// Learning Java assignments (Assignment) - practice file from Assignments, pushed 2026-10-21
package Assignment;

import java.util.Scanner;

public class SecondHighest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		System.out.println("Enter 5 numbers:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int highest = arr[0];
		int secondHighest = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > highest) {
				secondHighest = highest;
				highest = arr[i];
			} else if (arr[i] > secondHighest && arr[i] != highest) {
				secondHighest = arr[i];
			}
		}

		System.out.println("Second Highest Number = " + secondHighest);

		sc.close();
	}
}
