// Learning oop (day 16) - practice file from oop, pushed 2026-10-27
package day16;

public class Method {

    public static void main(String[] args) {

        Car c = new Car();

        System.out.println(c.brand);   // accessing instance variables

        // accessing instance methods
        c.showDetails();
        c.welcome("Amit");
    }
}

class Car {

    String brand;
    String model;
    String color;
    int price;

    // Default Constructor
    Car() {
        brand = "Toyota";
        model = "Fortuner";
        color = "Black";
        price = 4500000;
    }

    // Parameterized Constructor
    Car(String brand, String model, String color, int price) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // [accessModifier] [NONaccessModifier] return type methodName([parameters])   <---- declaration
    // { ... method body ... }  <--- definition / body / implementation

    // void method --> doesn't return anything
    // non-void methods --> they must return something

    void showDetails() {
        // non parameterized void method

        System.out.println("Displaying car details");
        
    }

    void welcome(String name) {
        System.out.println("Welcome " + name);
    }
    int getSqure() {
    int i = 0;
    }
}
