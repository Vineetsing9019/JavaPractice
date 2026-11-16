// Learning Java basics (day 8) - practice file from introjava, pushed 2026-10-22
package day8;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 5; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}
