// Learning oop (day 16) - practice file from oop, pushed 2026-10-20
package day16;

import java.util.Scanner;

public class MethodDemo {

    public static void main(String[] args) {
    }
    package day16;

    public class Car {

        String brand;
        String model;
        String color;
        int price;

        // Constructor
        Car(String brand, String model, String color, int price) {

            this.brand = brand;
            this.model = model;
            this.color = color;
            this.price = price;
        }
    }

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter brand, model, color and price of a car:");

        String brand = sc.next();
        String model = sc.next();
        String color = sc.next();
        int price = sc.nextInt();

        Car car = new Car(brand, model, color, price);

        System.out.println("Brand : " + car.brand);
        System.out.println("Model : " + car.model);
        System.out.println("Color : " + car.color);
        System.out.println("Price : " + car.price);

        sc.close();
    }
}
