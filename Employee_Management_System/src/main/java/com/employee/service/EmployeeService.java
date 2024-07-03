package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeService {

	public String CreateEmployee(Employee employee);
	public String UpdateEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(Integer ID);
	public String deleteemployeeById(Integer ID);
}
