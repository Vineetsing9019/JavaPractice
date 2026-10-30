// Learning Java basics (day 12) - practice file from introjava, pushed 2026-10-30
package day12;

public class Triangles {

    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {      // Outer loop (rows)

            for (int j = 5; j >= i; j--) {  // Inner loop

                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
