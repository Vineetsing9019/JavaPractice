// Learning Java basics (day 3) - practice file from introjava, pushed 2026-10-25
package day3;
import java.util.Scanner;

public class division {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double radius =5;
		double area;
		
		System.out.print("enter the radius of the circle:");
		radius = sc.nextDouble();
		
		area = Math.PI * radius * radius;
		
		System.out.println("Area of Circle = " + area);
		
		sc.close();
		
		
	}
}

