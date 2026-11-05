// Learning repositories in CRUD with JDBC - practice file from EmployeeCrudJdbc, pushed 2026-11-05
package com.itvedant.emp.repository;

import java.util.List;

import com.itvedant.emp.models.Employee;

public interface EmployeeDao {
	public boolean addEmployee(Employee employee);
	public  boolean updateEmployee(Employee employee);
	public boolean deleteEmployee(Employee employee);
	
	public Employee getEmployeeById(int id);
	public List<Employee> getAllEmployees();
	List<Employee> getALLEmployees();
}

