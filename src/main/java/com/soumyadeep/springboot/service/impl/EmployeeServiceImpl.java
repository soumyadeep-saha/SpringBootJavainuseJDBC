package com.soumyadeep.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soumyadeep.springboot.dao.EmployeeDao;
import com.soumyadeep.springboot.model.Employee;
import com.soumyadeep.springboot.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	@Override
	public void insertEmployee(Employee emp) {

		employeeDao.insertEmployee(emp);
	}

	@Override
	public void insertEmployees(List<Employee> employees) {

		employeeDao.insertEmployees(employees);
	}

	@Override
	public void getAllEmployees() {

		List<Employee> employees = employeeDao.getAllEmployees();
		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}
	}

	@Override
	public void getEmployeeById(String empid) {

		Employee employee = employeeDao.getEmployeeById(empid);
		System.out.println(employee);
	}

}
