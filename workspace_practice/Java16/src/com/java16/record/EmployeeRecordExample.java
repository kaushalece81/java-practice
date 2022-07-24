package com.java16.record;

public class EmployeeRecordExample {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1001, "kaushal", 40, 40000.0);
		System.out.println("e1.name(): " + e1.name());
		System.out.println("e1: " + e1);

		Employee e2 = new Employee(1001, "kaushal", 40, 40000.0);
		System.out.println("e1.equals(e2): " + e1.equals(e2));
//		Employee e = new Employee();
//		System.out.println("e: " + e);
	}
}
