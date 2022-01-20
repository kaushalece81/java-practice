package com.java7;

import java.util.ArrayList;
import java.util.List;

/*Problems solved
Avoids code redundancy 
Simplifies coding
Compiler infers the data type*/
public class DiamondOperator {

	public static void main(String[] args) {
		beforeJava7();
		afterJava7();

	}

	private static void afterJava7() {
		System.out.println("Inside afterJava7===============: ");
		List<String> list =new ArrayList<>();
		list.add("A");
		list.add("B");
		System.out.println(list);
		
	}

	private static void beforeJava7() {
		System.out.println("Inside beforeJava7===============: ");
		List<String> list =new ArrayList<String>();
		list.add("A");
		list.add("B");
		System.out.println(list);
	}

}
