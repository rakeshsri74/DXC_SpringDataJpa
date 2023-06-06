package com.dxc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
