package com.dxc.service;

import java.util.List;

import com.dxc.model.Employee;

public interface EmployeeService {

	public Employee create(Employee employee);
	public Employee update(Employee employee);
	public void delete(Long id);
	public Employee read(Long id);
	public List<Employee> read();
}
