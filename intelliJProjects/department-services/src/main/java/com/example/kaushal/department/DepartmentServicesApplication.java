package com.example.kaushal.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DepartmentServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServicesApplication.class, args);
	}

}
