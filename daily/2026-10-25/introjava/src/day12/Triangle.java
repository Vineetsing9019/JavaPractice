// Learning Java basics (day 12) - practice file from introjava, pushed 2026-10-25
package day12;

public class Triangle {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {     // Outer loop (rows) this defines number of roes we want

            for (int j = 1; j <= i; j++) { // Inner loop (numbers) depends upon i

                System.out.print(j + " ");
            }

            System.out.println( );
        }
    }
}

