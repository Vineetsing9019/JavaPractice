// Learning arrays (day 14) - practice file from ArrayDemos, pushed 2026-10-20
package day14;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {

        int size = 5;
        int[] values = new int[size];
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter " + size + " numbers:");

        // Input
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }

        // Calculate sum
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}

