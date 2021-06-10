package com.nagarro.hrportal.services;

import java.util.List;

import com.nagarro.hrportal.models.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Employee getEmployee(int empId);

	public void addEmployee(Employee employee);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(int empId);

}
