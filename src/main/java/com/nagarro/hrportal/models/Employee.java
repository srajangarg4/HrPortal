package com.nagarro.hrportal.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class Employee {

	@NumberFormat(style = Style.NUMBER)
	private int empId;
	private String empName;
	private String location;
	private String email;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;

	public Employee() {
	}

	public Employee(int empId, String empName, String location, String email, Date dob) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.location = location;
		this.email = email;
		this.dob = dob;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getLocation() {
		return location;
	}

	public String getEmail() {
		return email;
	}

	public Date getDob() {
		return dob;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
