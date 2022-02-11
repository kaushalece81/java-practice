package com.java5;

public class VarargsExample {

	static void display(String... values) {
		System.out.println("display method invoked length" + values.length);
		for (String str : values) {
			System.out.println("str=" + str);
		}
	}

	static void display(int num, String... values) {
		System.out.println("number is " + num);
		for (String str : values) {
			System.out.println("str=" + str);
		}
	}

	public static void main(String[] args) {
		System.out.println("display(String... values)================");
		display();// zero argument
		display("my", "name", "is", "varargs");// four arguments
		System.out.println("display(int num, String... values)================");
		display(500,"hello");//one argument   
		display(1000,"my","name","is","varargs");//four arguments  
	}

}
