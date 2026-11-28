// Learning core java (day 3) - practice file from CoreJava, pushed 2026-11-28
package Day3;

public class TernaryOperator {
 
	public static void main(String[] args) {
		
		
		int marks = 45;
		String result=(marks>= 35)? "pass":"fail";
		System.out.println("RESULT IS:" + result);
		
		int a = 10;
		int b = 20;
		int bigger=(a>b)? a:b;
		System.out.println("Bigger number is " + bigger );
		
		
		int num = 7 ;
		String type=(num % 2 == 0)?"even":"odd";
		System.out.println( "NUMBER " + num + " IS " + type);
	}
}

