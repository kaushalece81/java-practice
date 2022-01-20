package com.java9.privatemethodinterface;

import java.util.Random;
// to avoid duplicate or redundant code so create common logic in private method
public interface NoPrivateMethodInInterfaceBeforeJava9 {
	public static void displayRandomNumber() {
		Random random =new  Random();
		int randomNumber =random.nextInt(5000);
		System.out.println("randomNumber:: "+randomNumber);
	}
	public static void displayRandomNumber2() {
		Random random =new  Random();
		int randomNumber =random.nextInt(5000);
		String appendCode= "ABC" + randomNumber;
		System.out.println("randomNumber after appending code :: "+appendCode);
	}
// duplicate code we can't declare private method before java9
//	Random random =new  Random();
//	int randomNumber =random.nextInt(5000);

}
