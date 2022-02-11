package com.java5;

public class AutoBoxingExample {

	static void m(int i) {
		System.out.println("int");
	}

	public static void main(String[] args) {
		int a = 50;
		// deprecated
		Integer a2 = new Integer(a);// Boxing

		Integer a3 = 5;// Boxing

		System.out.println(a2 + " " + a3);

		short s = 30;
		m(s);


	}

}
