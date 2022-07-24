package com.java10;

import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		// String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		 String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		 String email="kaushal@gmail.com";
		 
		 System.out.println(email.matches(regex));
		 System.out.println(Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", email));


	}

}
