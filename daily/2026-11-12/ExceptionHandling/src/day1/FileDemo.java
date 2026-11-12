// Learning exception handling (day 1) - practice file from ExceptionHandling, pushed 2026-10-19
package day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDemo {
public static void main(String[] args) {
	try {
		FileDemo fis = new FileDemo("data.txt"); //fnfe
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter two numbers");
	int num1 = sc.nextInt(); //IME
	int num2 = sc.nextInt(); //IME
    int quotient = num1/ num2; //AE	
    System.out.println(" the  quotient is: " + quotient);
    int[] data = {10,20,30,40,50};
    System.out.println(data[8]); //AIOBE
	
}
}

