package com.nagarro.hrportal.services;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nagarro.hrportal.models.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private String REST_API_URI = "http://localhost:8081/";
	private String EMPLOYEES_URI = "employees/";

	RestTemplate restTemplate;

	public EmployeeServiceImpl() {
		restTemplate = new RestTemplate();
	}

	@Override
	public List<Employee> getAllEmployees() {
		Employee[] employees = null;
		try {
			employees = restTemplate.getForObject(REST_API_URI + EMPLOYEES_URI, Employee[].class);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return Arrays.asList(employees);
	}

	@Override
	public Employee getEmployee(int empId) {
		Map<String, Integer> params = new HashMap<>();
		params.put("empId", empId);
		Employee employee = null;
		try {
			employee = restTemplate.getForObject(REST_API_URI + EMPLOYEES_URI + "{empId}", Employee.class, params);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return employee;
	}

	@Override
	public void addEmployee(Employee employee) {
		try {
			restTemplate.postForEntity(REST_API_URI + EMPLOYEES_URI, employee, null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void updateEmployee(Employee employee) {
		try {
			restTemplate.put(REST_API_URI + EMPLOYEES_URI, employee);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void deleteEmployee(int empId) {
		Map<String, Integer> params = new HashMap<>();
		params.put("empId", empId);
		try {
			restTemplate.delete(REST_API_URI + EMPLOYEES_URI + "{empId}", params);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
