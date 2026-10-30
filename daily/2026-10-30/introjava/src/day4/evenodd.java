// Learning Java basics (day 4) - practice file from introjava, pushed 2026-10-30
package day4;
import java.util.Scanner;
public class evenodd {
public static void main(String[] args) {
	
	int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("plz enter any number");
		num = sc.nextInt();
		if(num%2==0) {
			System.out.println("even no");
			
		}
		else {
			System.out.println("odd no");
		}
  }
}
		
