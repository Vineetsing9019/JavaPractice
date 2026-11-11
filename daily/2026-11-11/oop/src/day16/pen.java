// Learning oop (day 16) - practice file from oop, pushed 2026-10-17
package day16;

public class pen {

    // instance variables
    String company, color, type;
    int price;

    pen() { // zero constructor
        System.out.println("pen object created");
    }

    pen(String company, String color, String type, int price) { // parameterized constructor
        System.out.println("Pen : parameterized constructor called");

        this.company = company;
        this.color = color;
        this.price = price;
        this.type = type;
    }

    public static void main(String[] args) {

        pen p = new pen(); // zero constructor is called

        pen p1 = new pen("Cello Gripper", "black", "ball pen", 10);

        System.out.println(p1.color);
        System.out.println(p1.price);

        pen p2 = new pen("Camlin", "Red", "Marker", 25);

        System.out.println(p2.price);

        pen gelPen; // object declaration

        gelPen = p1;

        System.out.println(gelPen.price);
    }
}
