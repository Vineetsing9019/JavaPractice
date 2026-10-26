// Learning practice (day 2) - practice file from practice, pushed 2026-10-26
package day2;

import java.util.Scanner;

public class Useofscanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
 
        System.out.print("Enter your pay: ");
        double pay = scanner.nextDouble();

        System.out.print("Are you a member? (true/false): ");
        boolean isMember = scanner.nextBoolean();

        System.out.println("\n----- Details -----");
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your pay is " + pay);
        System.out.println("Member: " + isMember);

        scanner.close();
    }
}

