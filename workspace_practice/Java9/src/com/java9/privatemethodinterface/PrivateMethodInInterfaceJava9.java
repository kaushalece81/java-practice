package com.java9.privatemethodinterface;

import java.util.Random;
//by default all the methods in interface is public
//private methods introduced in interface from java9
// to avoid duplicate or redundant code so create common logic in private method
public interface PrivateMethodInInterfaceJava9 {
	public static void displayRandomNumber() {
		int randomNumber = getRandomNumber();
		System.out.println("randomNumber:: "+randomNumber);
	}
	public static void displayRandomNumber2() {
		int randomNumber = getRandomNumber();
		String appendCode= "ABC" + randomNumber;
		System.out.println("randomNumber after appending code :: "+appendCode);
	}
	private static int getRandomNumber() {
		Random random =new  Random();
		int randomNumber =random.nextInt(5000);
		return randomNumber;
	}


}
