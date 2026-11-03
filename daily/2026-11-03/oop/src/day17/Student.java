// Learning oop (day 17) - practice file from oop, pushed 2026-11-03
package day17;

public class Student {

    String name;
    String lastName;
    int age;
    int rollNo;

    // Zero-parameter constructor
    Student() {
        System.out.println("Student zero constructor");
    }

    // Parameterized constructor
    Student(int rollNo, int age, String name, String lastName) {
        System.out.println("Student parameter constructor");

        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
        this.lastName = lastName;
    }

    
    public String toString() {
        // Returns the String representation of the object
        return "Student Details : RollNo = " + rollNo
                + ", Age = " + age
                + ", Name = " + name
                + ", LastName = " + lastName;
    }

    public static void main(String[] args) {

        Student s1 = new Student(101, 4, "Misty", "Lab");

        System.out.println(s1);
    }
}
