// Learning jdk8features (jdk8Featuresday1) - practice file from jdk8Features, pushed 2026-10-26
package jdk8Featuresday1;

public class RunnableDemo {
	public static void main(String[]args) {
		
		Thread t = new Thread(()->System.out.println("runnable lambda demo2")); 
		t.start();
	}

}
