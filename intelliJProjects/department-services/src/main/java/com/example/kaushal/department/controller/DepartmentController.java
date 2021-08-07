package com.example.kaushal.department.controller;

import com.example.kaushal.department.entity.Department;
import com.example.kaushal.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("inside the findDepartmentById method of DepartmentController");
        Optional<Department> departmentById = departmentService.findDepartmentById(departmentId);
        return departmentById.isPresent()? departmentById.get(): null;
    }
}
