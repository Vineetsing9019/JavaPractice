// Learning oop (OVERLOADING) - practice file from oop, pushed 2026-10-16
package OVERLOADING;

public class Shape {
	// OVERRIDING: SAME NAME BUT DIFFERENCE IN PARAMETER LIST
	// CONSTRUCTOR OVERLOADING , METHOD OVERLOADING
	
	Shape(){}
Shape(String name) {}



public void CalculateArea(int radius) {
	System.out.println("circle area");
	}

public void CalculateArea(int length, int breadth) {
	System.out.println("rectangle area");
	}

public void CalculateArea(String square, int side) {
	System.out.println("square area");
	}

public static void main(String []args) {
	Shape s = new Shape();
	s.CalculateArea(10);
	s.CalculateArea(10,20);
	s.CalculateArea("square" ,10);
}
}

