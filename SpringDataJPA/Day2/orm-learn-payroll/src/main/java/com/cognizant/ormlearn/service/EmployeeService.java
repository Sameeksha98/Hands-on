package com.cognizant.ormlearn.service;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Transactional
	public Employee get(int id) {

		

	return employeeRepository.findById(id).get();

	}
	
	@Transactional

	public void save(Employee employee) {

	

	employeeRepository.save(employee);

	

	}
}