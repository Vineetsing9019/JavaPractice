// Learning jdk8features (jdk8Featuresday1) - practice file from jdk8Features, pushed 2026-10-19
package jdk8Featuresday1;

public class Lambda3 {
	public static void main(String[]args) {
		
		MathOpr addition = (n1,n2) -> n1+n2;
		double answer = addition.calculate(10.5,10.5);
		System.out.println("Addition is "+ answer);
		
		MathOpr add = (n1,n2) -> {
			System.out.println("its a lengthy code , using{}");
			return n1+n2;
		};
		double ans = add.calculate(0.5,100);
		System.out.println("ans="+ ans);
		
		MathOpr multiply = (n1,n2) -> n1*n2;
		double m = multiply.calculate(100, 1234)
			
 	}
	}
interface MathOpr{
	double calculate(double n1, double n2);

}

