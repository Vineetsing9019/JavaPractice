// Learning CRUD with JDBC (test) - practice file from EmployeeCrudJdbc, pushed 2026-10-28
package com.itvedant.emp.test;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.itvedant.emp.models.Employee;
import com.itvedant.emp.repository.EmployeeDao;
import com.itvedant.emp.repository.EmployeeDaoImpl;

public class EmployeeManagement {

    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Creating DAO object
        EmployeeDao dao = new EmployeeDaoImpl();

        int choice;

        while (true) {

            System.out.println("\n== Employee Management ==");

            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Search Employee by Id");
            System.out.println("5. Display all Employees");
            System.out.println("6. Exit");

            System.out.println("Please enter your choice:");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("Please enter id:");
                    int id = sc.nextInt();

                    sc.nextLine(); // Clears the Enter key from buffer

                    System.out.println("Please enter name:");
                    String name = sc.nextLine();

                    System.out.println("Please enter department:");
                    String dept = sc.nextLine();

                    System.out.println("Please enter salary:");
                    int salary = sc.nextInt();

                    // Creating Employee object
                    Employee e = new Employee(id, name, dept, salary);

                    // Calling addEmployee method
                    boolean response = dao.addEmployee(e);

                    if (response) {
                        System.out.println("Employee added successfully");
                    } else {
                        System.err.println("Sorry!! Employee is not added");
                    }

                    break;

                case 2:

                    // Update Employee

                    System.out.println("Please enter id:");
                    id = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Please enter new name:");
                    name = sc.nextLine();

                    System.out.println("Please enter new department:");
                    dept = sc.nextLine();

                    System.out.println("Please enter new salary:");
                    salary = sc.nextInt();

                   
                    e = new Employee(id, name, dept, salary);

                   
                    response = dao.updateEmployee(e);

                    if (response) {
                        System.out.println("Employee updated successfully");
                    } else {
                        System.err.println("Sorry!! Employee is not updated");
                    }

                    break;

                case 3:

                    

                    System.out.println("Please enter employee id to delete:");

                    id = sc.nextInt();

                    // Creating Employee object
                    e = new Employee();

                    e.id = id;

                    // Calling deleteEmployee method
                    response = dao.deleteEmployee(e);

                    if (response) {

                        System.out.println("Employee deleted successfully");

                    } else {

                        System.err.println("Sorry!! Employee is not deleted");

                    }

                    break;
                case 4:

                    

                    System.out.println("Please enter employee id:");

                    id = sc.nextInt();

                    
                    Employee employee = dao.getEmployeeById(id);

                    // Checking if employee exists
                    if (employee != null) {

                        System.out.println("Employee found:");
                        System.out.println(employee);

                    } else {

                        System.err.println("Sorry!! Employee not found");

                    }

                    break;

                case 5:

                    // Display all Employees
                	
                	List<Employee> allemployees = dao.getAllEmployees();
                	Iterator<Employee> itr = allemployees.iterator();
                	while(itr.hasNext()) {
                		System.out.println(itr.next());
                	}
                    break;

                case 6:

                    System.out.println("Thank you for using Employee Management App");

                    sc.close();

                    System.exit(0);

                    break;

                default:

                    System.out.println("Please enter a valid choice from 1 to 6");
            }
        }
    }
}
