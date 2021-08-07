package com.example.mongodemo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@ApiModel(description = "Details of the Employee")
@Document(value = "Employees")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
	@ApiModelProperty(notes ="Unique Id of the Employee")
	@Id
	private String id;
	@ApiModelProperty(notes ="First Name of the Employee", required = true)
	private String firstName;
	@ApiModelProperty(notes ="Last Name of the Employee", required = false)
	private String lastName;
	@ApiModelProperty(notes ="Salary of the Employee", required = true)
	private double salary;
	private Address address;
	@ApiModelProperty(notes ="Date of Joining of the Employee", required = true)
	private Date doj;

}
