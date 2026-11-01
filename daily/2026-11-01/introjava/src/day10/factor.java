// Learning Java basics (day 10) - practice file from introjava, pushed 2026-11-01
package day10;

public class factor {

    public static void main(String[] args) {

        int i;
        int num=6;

        for (i = 1; i <= 6; i++) {

            if (num  % i == 0) {
                System.out.println(i + " is a factor of 6");
            } else {
                System.out.println(i + " is not a factor of 6");
            }
        }
    }
}

