// Learning oop (inhertance) - practice file from oop, pushed 2026-11-04
package inhertance;

public class Person {

    // inheritance: mechanism by which one class(child class) can acquire the properties
    // of another class (parent class)

    String name, gender, birthDate;

    void eat() {
        System.out.println("eating");
    }

    void sleep() {
        System.out.println("sleeping");
    }

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.name);
        s.sleep();
        s.eat();

    }

}

class Student extends Person {

    // instance variables and instance methods are inherited by child class

}
