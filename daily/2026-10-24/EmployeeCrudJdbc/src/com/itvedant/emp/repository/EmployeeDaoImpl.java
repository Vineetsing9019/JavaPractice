// Learning repositories in CRUD with JDBC - practice file from EmployeeCrudJdbc, pushed 2026-10-24
package com.itvedant.emp.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.itvedant.emp.models.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

    Connection connection;
    PreparedStatement preparedStatement;
    int rowCount;

    String query;

    String user = "root";
    String password = "<password>";

    String url = "jdbc:mysql://localhost:3306/employeecrud";

    boolean response;

    @Override
    public boolean addEmployee(Employee employee) {

        try {

            response = false;

            // Loading MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Creating connection with database
            connection = DriverManager.getConnection(url, user, password);

            // SQL query
            query = "INSERT INTO employee VALUES (?, ?, ?, ?)";

            // Partial query
            preparedStatement = connection.prepareStatement(query);

            // Setting values in query
            preparedStatement.setInt(1, employee.id);
            preparedStatement.setString(2, employee.name);
            preparedStatement.setString(3, employee.dept);
            preparedStatement.setInt(4, employee.salary);

            // Executing INSERT query
            rowCount = preparedStatement.executeUpdate();

            // Checking if one row is inserted
            if (rowCount == 1) {
                response = true;
            }

            // Closing database connection
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();
        }

        return response;
    }


    @Override
    public boolean updateEmployee(Employee employee) {

        try {

            response = false;

            // Loading MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Creating connection with database
            connection = DriverManager.getConnection(url, user, password);

            // SQL query
            query = "UPDATE employee SET name=?, dept=?, salary=? WHERE id=?";

            // Partial query
            preparedStatement = connection.prepareStatement(query);

            // Setting values in query
            preparedStatement.setString(1, employee.name);
            preparedStatement.setString(2, employee.dept);
            preparedStatement.setInt(3, employee.salary);
            preparedStatement.setInt(4, employee.id);

            // Executing UPDATE query
            rowCount = preparedStatement.executeUpdate();

            // Checking if one row is updated
            if (rowCount == 1) {
                response = true;
            }

            // Closing database connection
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();
        }

        return response;
    }


    @Override
    public boolean deleteEmployee(Employee employee) {

        try {

            response = false;

            // Loading MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Creating connection with database
            connection = DriverManager.getConnection(url, user, password);

            // SQL query
            query = "DELETE FROM employee WHERE id=?";

            // Partial query
            preparedStatement = connection.prepareStatement(query);

            // Setting employee id
            preparedStatement.setInt(1, employee.id);

            // Executing DELETE query
            rowCount = preparedStatement.executeUpdate();

            // Checking if one row is deleted
            if (rowCount == 1) {
                response = true;
            }

            // Closing database connection
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();
        }

        return response;
    }


    @Override
    public List<Employee> getAllEmployees() {

        // Creating ArrayList to store all employees
        List<Employee> allEmployees = new ArrayList<Employee>();

        try {

           
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Creating connection with database
            connection = DriverManager.getConnection(url, user, password);

            // SQL query
            query = "SELECT * FROM employee";

            // Preparing query
            preparedStatement = connection.prepareStatement(query);

            // Executing SELECT query
            ResultSet rs = preparedStatement.executeQuery();

            // Reading every row
            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String dept = rs.getString("dept");
                int salary = rs.getInt("salary");

                // Creating Employee object
                Employee e = new Employee(id, name, dept, salary);

                // Adding employee object to ArrayList
                allEmployees.add(e);
            }

            // Closing connection
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();
        }

        return allEmployees;
    }


    @Override
    public Employee getEmployeeById(int id) {

        // Creating Employee reference
        Employee employee = null;

        try {

           
            Class.forName("com.mysql.cj.jdbc.Driver");

      
            connection = DriverManager.getConnection(url, user, password);

           
            query = "SELECT * FROM employee WHERE id=?";

            
            preparedStatement = connection.prepareStatement(query);

           
            preparedStatement.setInt(1, id);

           
            ResultSet rs = preparedStatement.executeQuery();

           
            if (rs.next()) {

                int employeeId = rs.getInt("id");
                String name = rs.getString("name");
                String dept = rs.getString("dept");
                int salary = rs.getInt("salary");

                
                employee = new Employee(employeeId, name, dept, salary);
            }

           
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();
        }

        return employee;
    }


	@Override
	public List<Employee> getALLEmployees() {
		// TODO Auto-generated method stub
		return null;
	}
}
