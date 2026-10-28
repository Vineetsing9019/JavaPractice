// Learning oop (day 16) - practice file from oop, pushed 2026-10-28
package day16;

import java.util.Scanner;

public class MethodSuare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        MethodSuare obj = new MethodSuare();

        int result = obj.square(num);

        System.out.println("Square = " + result);

        sc.close();
    }

    // Method that takes one number and returns its square
    int square(int num) {
        return num * num;
    }
}
