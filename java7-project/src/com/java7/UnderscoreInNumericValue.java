package com.java7;

import java.util.ArrayList;
import java.util.List;


public class UnderscoreInNumericValue {

	public static void main(String[] args) {
		beforeJava7();
		afterJava7();

	}

	private static void afterJava7() {
		System.out.println("Inside afterJava7===============: ");
		int creditCardNumber=5264_6489;  // allowed after java7
		System.out.println(creditCardNumber);
		
	}

	private static void beforeJava7() {
		System.out.println("Inside beforeJava7===============: ");
		int creditCardNumber=5264_6489;  //not  allowed before java7
		//error syntax error on token _6489 delete this token
		System.out.println(creditCardNumber);
	}

}
