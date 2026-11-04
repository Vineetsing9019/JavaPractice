// Learning Java basics (day 10) - practice file from introjava, pushed 2026-11-04
package day10;

public class LoopBreak {

    public static void main(String[] args) {

        int i;

        for (i = 11; i <= 15; i++) {

            if (i % 4 == 0) {
                System.out.println("Loop breaks at " + i);
                break;
            }
        }
    }
}

