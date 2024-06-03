package com.biswa.entity;

import java.time.LocalDate;


import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class UserAccount {
	
	@Id
	@GeneratedValue
	private Integer userId;
	
	private String fullName;
	
	private String email;
	
	private Long phno;
	
	private String gender;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	
	private Long ssn;
	
	private String activeSw;
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate createDate;
	
	@CreationTimestamp
	@Column(insertable = false)
	private LocalDate updateDate;
	
	

	public UserAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public UserAccount(Integer userId, String fullName, String email, Long phno, String gender, LocalDate dob, Long ssn,
			String activeSw, LocalDate createDate, LocalDate updateDate) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.email = email;
		this.phno = phno;
		this.gender = gender;
		this.dob = dob;
		this.ssn = ssn;
		this.activeSw = activeSw;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}



	public Integer getuserId() {
		return userId;
	}

	public void setUserid(Integer userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Long getSsn() {
		return ssn;
	}

	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}

	public String getActiveSw() {
		return activeSw;
	}

	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "UserAccount [userid=" + userId + ", fullName=" + fullName + ", email=" + email + ", phno=" + phno
				+ ", gender=" + gender + ", dob=" + dob + ", ssn=" + ssn + ", activeSw=" + activeSw + ", createDate="
				+ createDate + ", updateDate=" + updateDate + "]";
	}
	
	

}
