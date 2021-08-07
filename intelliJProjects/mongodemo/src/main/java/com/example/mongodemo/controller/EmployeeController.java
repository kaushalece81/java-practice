package com.example.mongodemo.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.mongodemo.entity.Employee;
import com.example.mongodemo.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

import javax.websocket.server.PathParam;
import java.util.Date;
import java.util.List;


@ApiOperation(notes = "Employee System", value="Employee Management System")
@RestController
@RequestMapping("/api")
@Slf4j
public class EmployeeController {

	@Autowired
    private EmployeeService employeeService;

//  localhost:8080/api/employees/
    @ApiOperation(notes = "Save Employee notes", value="Save Employee")
    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee){
        log.info("inside saveEmployee method of EmployeeController");
        employee.setDoj(new Date());
        return employeeService.saveEmployee(employee);
    }

    //  localhost:8080/api/employees/
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        log.info("inside updateEmployee method of EmployeeController");
        return employeeService.updateEmployee(employee);
    }

    //  localhost:8080/api/employees/
    @DeleteMapping("/employees")
    public long deleteEmployee(@RequestBody Employee employee){
        log.info("inside deleteEmployee method of EmployeeController");
        return employeeService.deleteEmployee(employee);
    }

    //  localhost:8080/api/employees/
    @GetMapping("/employees")
    public List<Employee> findEmployeeAll(){
        log.info("inside findEmployeeAll method of EmployeeController");
        return employeeService.findEmployeeAll();
    }
// localhost:8080/api/employees/salary?salary=5000
    @GetMapping("/employees/salary")
    public List<Employee> findEmployeeBySalary(@RequestParam("salary") double salary){
        log.info("inside findEmployeeBySalary method of EmployeeController");
        return employeeService.findEmployeeBySalary(salary);
    }
// localhost:8080/api/employees/firstName?firstName=Kaushal
@ApiOperation(notes = "Find employee by first name notes", value="Find employee by first name", response = List.class)
    @GetMapping("/employees/firstName")
    public List<Employee> findEmployeeByFirstName(@RequestParam("firstName") String firstName){
        log.info("inside findEmployeeByFirstName method of EmployeeController");
        return employeeService.findEmployeeByFirstName(firstName);
    }
}
