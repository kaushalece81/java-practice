package com.java5;

public class UnboxingExample {

	public static void main(String[] args) {
		Integer i = new Integer(50);
		int a = i;
		System.out.println(a);

		if (i < 100) { // unboxing internally
			System.out.println(i);
		}

	}

}
