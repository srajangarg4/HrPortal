package com.nagarro.hrportal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nagarro.hrportal.models.Employee;
import com.nagarro.hrportal.services.EmployeeService;

@Controller
public class EmployeeController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@RequestMapping("/")
	public String getEmployees(Model model) {
		model.addAttribute("employees", employeeService.getAllEmployees());
		return "allEmployees";
	}

	@RequestMapping("/new")
	public String newEmployee(Model model) {
		model.addAttribute("employee", new Employee());
		model.addAttribute("action", "/add");
		return "employee";
	}

	@RequestMapping("/{empId}")
	public String getEmployee(@PathVariable("empId") int empId, Model model) {
		model.addAttribute("employee", employeeService.getEmployee(empId));
		model.addAttribute("action", "/update/" + empId);
		return "employee";
	}

	@RequestMapping("/update/{empId}")
	public String updateEmployee(@PathVariable int empId, @ModelAttribute("employee") Employee employee,
			BindingResult result, Model model) {
		employee.setEmpId(empId);
		if (result.hasErrors()) {
			model.addAttribute("error", "Unable to bind object");
			return "error";
		}
		employeeService.updateEmployee(employee);
		return "redirect:/";
	}

	@RequestMapping("/add")
	public String addEmployee(@ModelAttribute("employee") Employee employee, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("error", "Unable to bind object");
			return "error";
		}
		employeeService.addEmployee(employee);
		return "redirect:/";
	}

	@RequestMapping("/delete/{empId}")
	public String deleteEmployee(@PathVariable("empId") int empId) {
		employeeService.deleteEmployee(empId);
		return "redirect:/";
	}

}
