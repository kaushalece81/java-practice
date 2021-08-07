package com.example.mongodemo.repository;

import com.example.mongodemo.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface EmployeeRepository {

   public Employee saveEmployee(Employee employee);

   public List<Employee> findEmployeeAll();

   public Employee updateEmployee(Employee employee);

   public long deleteEmployee(Employee employee);

   public List<Employee> findEmployeeBySalary(double salary);

   public List<Employee> findEmployeeByFirstName(String firstName);
}