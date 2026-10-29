// Learning Java basics (day 5) - practice file from introjava, pushed 2026-10-29
package day5;

import java.util.Scanner;

public class divisibleby {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0 || num % 3 == 0) {
            System.out.println(num + " is divisible by 5 or 3.");
        } else {
            System.out.println(num + " is not divisible by 5 or 3.");
        }

        sc.close();
    }
}



