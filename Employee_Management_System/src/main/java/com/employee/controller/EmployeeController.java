package com.employee.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	
	private EmployeeServiceImpl serviceimpl;
	
	@PostMapping("/EmployeeCreate")
	public ResponseEntity<String> CreateEmployee(@RequestBody Employee employee){
		String status = serviceimpl.CreateEmployee(employee);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}
	
	@PutMapping("/EmployeeUpdate")
	public ResponseEntity<String> UpdateEmployee(@RequestBody Employee employee){
		String status = serviceimpl.UpdateEmployee(employee);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

	@GetMapping("/Employees")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		List<Employee> status = serviceimpl.getAllEmployee();
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
	
	@GetMapping("/Employee/{ID}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer ID){
		Employee status = serviceimpl.getEmployeeById(ID);
		return new ResponseEntity<>(status,HttpStatus.OK);
	}
	
	@DeleteMapping("/Employee/{ID}")
	public ResponseEntity<String> DeleteById(@PathVariable Integer ID){
		String status = serviceimpl.deleteemployeeById(ID);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
}
