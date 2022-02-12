package com.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee{
	private int eno;
	private String name;
	public Employee(int eno, String name) {
		super();
		this.eno = eno;
		this.name = name;
	}
	public Employee() {
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return eno+":"+name;
	}
}

public class SortEmployeesDesc {

	public static void main(String[] args) {
		List<Employee> list= new ArrayList<>();
		list.add(new Employee(107,"kaushal"));
		list.add(new Employee(100,"sharma"));
		list.add(new Employee(109,"kaushlender"));
		list.add(new Employee(110,"pawan"));
		list.add(new Employee(98,"ratnesh"));
		System.out.println("Before sorting==============");
		System.out.println(list);
		System.out.println("After custom order descending  sorting==============");
		Collections.sort(list,(e1,e2)-> e1.getEno()>e2.getEno()?-1:e1.getEno()<e2.getEno()?1:0);
		System.out.println(list);
		
		System.out.println("After custom order ascending sorting==============");
		Collections.sort(list,(e1,e2)-> e1.getEno()<e2.getEno()?-1:e1.getEno()>e2.getEno()?1:0);
		System.out.println(list);

	}

}
