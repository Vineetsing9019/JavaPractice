// Learning oop (day 22) - practice file from oop, pushed 2026-10-17
package day22;

public class Person {

    // Instance variables
    int id;
    String name, gender;

    // Zero constructor
    Person() {
        System.out.println("Person zero constructor called");
    }

    // Parameterized constructor
    Person(int id, String name, String gender) {
        System.out.println("Person parameterized constructor called");
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public static void main(String[] args) {

        // Calls Person zero constructor first, then Stu zero constructor
        Stu s = new Stu();
        System.out.println(s.name);

        // Calls Person parameterized constructor first, then Stu parameterized constructor
        Stu stu = new Stu(101, "Tushar", "Male", "Singhania", "2nd");
        System.out.println(stu.name);
    }
}

class Stu extends Person {

    // Child class variables
    String school, standard;

    // Zero constructor
    Stu() {
        // Calls the parent zero constructor
        super();
        System.out.println("Student zero constructor called");
    }

    // Stu(int id, String name, String gender, String school, String standard) {
    // Calls the parent parameterized constructor
    // super(id, name, gender);
    // System.out.println("Stu parameterized constructor");
    // this.school = school;
    // this.standard = standard;
    // }

    // Reusing the parameterized constructor in child class
    Stu(int id, String name, String gender, String school, String standard) {

        super(id, name, gender); // Call the parent class parameterized constructor
        System.out.println("Stu parameterized constructor called");

        this.school = school;
        this.standard = standard;
    }
}
