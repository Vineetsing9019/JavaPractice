package Day3;

public class IncrementDecrement { 
	
	public static void main(String[] args) {
		
		int runs = 10;
		int balls = 6;
		
		runs++;
		System.out.println(" Runs after 1 ball " + runs);
		
		balls--;
		System.out.println(" Balls left " + balls);
		
		int a = 10;
		System.out.println(" a++ gives: " + a++);
		System.out.println(" now a is: " + a);
		System.out.println(" ++a gives: " + ++a);
	}
}
