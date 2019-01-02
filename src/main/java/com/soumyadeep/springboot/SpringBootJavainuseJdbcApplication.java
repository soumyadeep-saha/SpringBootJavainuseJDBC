package com.soumyadeep.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.soumyadeep.springboot.model.Employee;
import com.soumyadeep.springboot.service.EmployeeService;

@SpringBootApplication
public class SpringBootJavainuseJdbcApplication {

	@Autowired
	EmployeeService employeeService;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJavainuseJdbcApplication.class, args);
		EmployeeService employeeService = context.getBean(EmployeeService.class);

		Employee emp = new Employee();
		emp.setEmpId("emp");
		emp.setEmpName("emp");

		Employee emp1 = new Employee();
		emp1.setEmpId("emp1");
		emp1.setEmpName("emp1");

		Employee emp2 = new Employee();
		emp2.setEmpId("emp2");
		emp2.setEmpName("emp2");

		employeeService.insertEmployee(emp);

		List<Employee> employees = new ArrayList<>();
		employees.add(emp1);
		employees.add(emp2);
		employeeService.insertEmployees(employees);

		employeeService.getAllEmployees();

		employeeService.getEmployeeById(emp1.getEmpId());
	}
}
