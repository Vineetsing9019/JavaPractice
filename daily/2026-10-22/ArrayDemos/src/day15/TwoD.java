// Learning arrays (day 15) - practice file from ArrayDemos, pushed 2026-10-22
package day15;

import java.util.Scanner;

public class TwoD {

    public static void main(String[] args) {

        int[][] twoD = new int[3][2];

        Scanner sc = new Scanner(System.in);

        int rows = 3;
        int columns = 2;

        System.out.println("Please enter " + (rows * columns) + " numbers:");

        // Input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twoD[i][j] = sc.nextInt();
            }
        }

        // Display
        System.out.println("Array Elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
