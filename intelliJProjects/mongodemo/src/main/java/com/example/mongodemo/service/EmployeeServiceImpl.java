package com.example.mongodemo.service;

import com.example.mongodemo.entity.Employee;
import com.example.mongodemo.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		log.info("Inside saveEmployee of EmployeeServiceImpl");
		return employeeRepository.saveEmployee(employee);
	}

	@Override
	public List<Employee> findEmployeeAll() {
		log.info("Inside findEmployeeAll of EmployeeServiceImpl");
		return employeeRepository.findEmployeeAll();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		log.info("Inside updateEmployee of EmployeeServiceImpl");
		return employeeRepository.updateEmployee(employee);
	}

	@Override
	public long deleteEmployee(Employee employee) {
		log.info("Inside deleteEmployee of EmployeeServiceImpl");
		return employeeRepository.deleteEmployee(employee);
	}

	@Override
	public List<Employee> findEmployeeBySalary(double salary) {
		log.info("Inside findEmployeeBySalary of EmployeeServiceImpl");
		return employeeRepository.findEmployeeBySalary(salary);
	}

	@Override
	public List<Employee> findEmployeeByFirstName(String firstName) {
		log.info("Inside findEmployeeByFirstName of EmployeeServiceImpl");
		return employeeRepository.findEmployeeByFirstName(firstName);
	}

}
