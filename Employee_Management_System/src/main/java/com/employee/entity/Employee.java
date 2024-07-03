package com.employee.entity;

import org.hibernate.annotations.IdGeneratorType;
import org.springframework.aot.generate.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue()
	private Integer ID;
	private String Ename;
	private Long MobileNo;
	private Double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer iD, String ename, Long mobileNo, Double salary) {
		super();
		ID = iD;
		Ename = ename;
		MobileNo = mobileNo;
		this.salary = salary;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public Long getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		MobileNo = mobileNo;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	

}
