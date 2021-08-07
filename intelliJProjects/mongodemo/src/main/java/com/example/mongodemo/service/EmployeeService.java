package com.example.mongodemo.service;

import com.example.mongodemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {

	public Employee saveEmployee(Employee employee);

	public List<Employee> findEmployeeAll();

	public Employee updateEmployee(Employee employee);

	public long deleteEmployee(Employee employee);

	public List<Employee> findEmployeeBySalary(double salary);

	public List<Employee> findEmployeeByFirstName(String firstName);
}
