// Learning arrays (day 14) - practice file from ArrayDemos, pushed 2026-10-26
package day14;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int size = 5;
        int[] values = new int[size];

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter " + size + " numbers:");

        // Input
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }
        sc.close();

        // Display
        for (int i = 0; i < values.length; i++) {
            System.out.println("Index: " + i + " Element: " + values[i]);
        }

        sc.close();
    }
}

