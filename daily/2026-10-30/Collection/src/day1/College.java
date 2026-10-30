// Learning the Collections framework (day 1) - practice file from Collection, pushed 2026-10-30
package day1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class College {

    public static void main(String[] args) {

        List<Student> students = new Array<>();

        students.add(new Student(101, "Nitin", 67.45));
        students.add(new Student(102, "Aarti", 68.45));
        students.add(new Student(103, "Pandey", 69.45));
        students.add(new Student(104, "Rudra", 70.45));
        students.add(new Student(105, "Pramod", 71.45));
        students.add(new Student(106, "Joyce", 72.45));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1: ID, 2: Name, 3: Percentage");
        int choice = sc.nextInt();

        switch (choice) {

        case 1:
            Collections.sort(students, new SortStudentById());
            break;

        case 2:
            Collections.sort(students, new SortStudentByName());
            break;

        case 3:
            Collections.sort(students, new SortStudentByPercentage());
            break;

        default:
            System.out.println("Invalid choice");
        }

        System.out.println("\nSorted Students:");

        for (Student s : students) {
            System.out.println(
                s.id + " " + s.name + " " + s.percentage
            );
        }

        sc.close();
    }
}


// Student class
class Student {

    int id;
    String name;
    double percentage;

    Student(int id, String name, double percentage) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }
}


// Sort students by ID
class SortStudentById implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.id, s2.id);
    }
}


// Sort students by Name
class SortStudentByName implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}


// Sort students by Percentage
class SortStudentByPercentage implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.percentage, s2.percentage);
    }
}
