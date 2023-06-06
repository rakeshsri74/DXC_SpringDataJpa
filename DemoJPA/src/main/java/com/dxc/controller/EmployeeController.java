package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.Employee;
import com.dxc.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService es;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return es.create(employee);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee(){
		return es.read();
	}
	
	@GetMapping("/employee/{id}")
	public Employee findEmployeeById(@PathVariable Long id) {
		return es.read(id);
	}
	
	@PutMapping("/employee")
	public Employee modifyEmployee(@RequestBody Employee employee) {
		return es.update(employee);
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		es.delete(id);
	}
	
}
