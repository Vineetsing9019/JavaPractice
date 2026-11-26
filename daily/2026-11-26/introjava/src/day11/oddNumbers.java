// Learning Java basics (day 11) - practice file from introjava, pushed 2026-10-15
package day11;

public class oddNumbers { 

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {      // Outer loop (4 rows)

            for (int j = 1; j <= 7; j += 2) {   // Inner loop (1 3 5 7)
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

