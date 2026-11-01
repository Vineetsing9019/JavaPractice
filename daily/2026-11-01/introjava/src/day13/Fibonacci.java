// Learning Java basics (day 13) - practice file from introjava, pushed 2026-11-01
package day13;

public class Fibonacci {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c;

        System.out.print("Fibonacci Series up to 100: ");
        System.out.print(a + " " + b + " ");

        while (true) {
            c = a + b;

            if (c > 100) {
                break;
            }

            
            System.out.print(c + " ");

            a = b;
            b = c;
        }
    }
}

