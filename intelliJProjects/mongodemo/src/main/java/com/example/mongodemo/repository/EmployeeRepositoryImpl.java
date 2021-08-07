package com.example.mongodemo.repository;

import com.example.mongodemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Employee saveEmployee(Employee employee) {
        return mongoTemplate.save(employee);
    }

    @Override
    public List<Employee> findEmployeeAll() {
        return mongoTemplate.findAll(Employee.class);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return mongoTemplate.save(employee);
    }

    @Override
    public long deleteEmployee(Employee employee) {
        return mongoTemplate.remove(employee).getDeletedCount();
    }

    @Override
    public List<Employee> findEmployeeBySalary(double salary) {
        Query query = new Query(Criteria.where("salary").gte(salary));
        return mongoTemplate.find(query, Employee.class);
    }

    @Override
    public List<Employee> findEmployeeByFirstName(String firstName) {
        Query query = new Query(Criteria.where("firstName").regex("^"+firstName));
        return mongoTemplate.find(query, Employee.class);
    }
}
