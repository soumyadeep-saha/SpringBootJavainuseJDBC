package com.soumyadeep.springboot.dao;

import java.util.List;

import com.soumyadeep.springboot.model.Employee;

public interface EmployeeDao {
	
	void insertEmployee(Employee cus);
	void insertEmployees(List<Employee> employees);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(String empId);
}
