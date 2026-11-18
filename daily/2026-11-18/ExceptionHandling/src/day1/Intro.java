// Learning exception handling (day 1) - practice file from ExceptionHandling, pushed 2026-10-24
package day1;

import java.util.Scanner;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Intro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // error prone code
            System.out.println("please enter 2 numbers");

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int quotient = num1 / num2;

            System.out.println("the quotient is: " + quotient);
        }

        catch (InputMismatchException e) {
            // handles invalid input
            System.out.println("enter valid number");
        }

        catch (ArithmeticException e) {
            // handles division by zero
            System.err.println("please make sure that second number should not be zero");
        }

        System.out.println("tried the division");
    }
}
