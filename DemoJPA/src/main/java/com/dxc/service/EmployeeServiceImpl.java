package com.dxc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.model.Employee;
import com.dxc.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository er;
	
	public Employee create(Employee employee) {
		return er.save(employee);
	}

	public Employee update(Employee employee) {
		return er.save(employee);
	}

	public void delete(Long id) {
		er.delete(read(id));

	}

	public Employee read(Long id) {
		Employee result = null;
		Optional<Employee> temp = er.findById(id);
		if(temp.isPresent()) {
			result = er.findById(id).get();
		}
		return result;
	}

	public List<Employee> read() {
		return er.findAll();
	}

}
