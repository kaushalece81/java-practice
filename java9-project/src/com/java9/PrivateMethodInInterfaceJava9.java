package com.java9;

import java.util.Random;
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
