// Learning entity models in CRUD with JDBC - practice file from EmployeeCrudJdbc, pushed 2026-10-31
package com.itvedant.emp.models;

public class Employee {

    public int id;

    public String name;

    public String dept;

    public int salary;

    // Default constructor
    public Employee() {

    }

    // Parameterized constructor
    public Employee(int id, String name, String dept, int salary) {

        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    // Display Employee object details
    @Override
    public String toString() {

        return "Employee [id=" + id
                + ", name=" + name
                + ", dept=" + dept
                + ", salary=" + salary
                + "]";
    }
}
