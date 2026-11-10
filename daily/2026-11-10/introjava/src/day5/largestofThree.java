// Learning Java basics (day 5) - practice file from introjava, pushed 2026-10-17
package day5;

import java.util.Scanner;

public class largestofThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int n1 = sc.nextInt();

        System.out.println("Enter Second Number:");
        int n2 = sc.nextInt();

        System.out.println("Enter Third Number:");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is the Largest Number");
        }
        else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is the Largest Number");
        }
        else {
            System.out.println(n3 + " is the Largest Number");
        }

        sc.close();
    }
}
