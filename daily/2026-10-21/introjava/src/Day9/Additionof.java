// Learning Java basics (day 9) - practice file from introjava, pushed 2026-10-21
package Day9;
import java.util.Scanner;
public class Additionof {
public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("enter any number");
	int sum=0;
	int i=1;
	int n;
	
	while(i<=5) {System.out.print("sum of " +  i  + "n");
	
	int num = scanner.nextInt();

    sum = sum + num;
    i++;
}

System.out.println("Sum = " + sum);

scanner.close();

	}
	
	
	
}


