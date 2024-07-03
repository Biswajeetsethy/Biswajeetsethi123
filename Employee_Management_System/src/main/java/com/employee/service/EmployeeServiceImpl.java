package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public String CreateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		repo.save(employee);
		
		return "Created";
	}

	@Override
	public String UpdateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		repo.save(employee);
		return "Updated";
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Employee getEmployeeById(Integer ID) {
		// TODO Auto-generated method stub
		Optional<Employee> op= repo.findById(ID);
		if(op.isPresent()) {
			return op.get();
		}
		return null;
	}

	@Override
	public String deleteemployeeById(Integer ID) {
		// TODO Auto-generated method stub
		if(repo.existsById(ID)) {
			repo.deleteById(ID);
			return "Successfully Deleted";
		}
		else {
			return "Record not found";
		}
	}

}
