// Learning jdk8features (jdk8Featuresday1) - practice file from jdk8Features, pushed 2026-10-23
package jdk8Featuresday1;


public class LambdaDemo {
public static void main(String []args ) {
//	Printable child = new PrintableChild();
//	child.print();
//	// lambdas/ lambda expressions - shirt hand coding                      
Printable p = ()-> {
	System.out.println("lambda for print");
	System.out.println("within lambda");
	}
p.print();
	}
}
/* Functional interface : that has Exactly 1 abstract method */
@FunctionalInterface
interface Printable{
	void print();
}
@FunctionalInterface
interface greet {
	void SayHello();}



//class PrintableChild implements Printable{
//
//	@Override
//	public void print() {
//		System.out.println("child class print()");
//	}
//	
//}

