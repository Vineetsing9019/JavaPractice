// Learning jdk8features (jdk8Featuresday1) - practice file from jdk8Features, pushed 2026-10-16
package jdk8Featuresday1;

import java.util.Scanner;

public class Lambda2 {
	public static void main(String []args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter name");
		String n = sc.next();
		greet g = (name) -> System.out.println("Welcome"+name);
		g.SayHello();
		
	}
}

