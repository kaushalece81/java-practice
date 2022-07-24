package com.java16.record;
//feature in java16
public record Employee(int id, String name, int age, double salary) {

	public Employee() {
		this(0,"",0,0.0);
		if(id<=0  || name ==null || name.isBlank() || age <=0 || salary<=0.0) {
			throw new IllegalArgumentException("Invalid Employee");
		}
	}
}
