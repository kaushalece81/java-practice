package com.java7;

public class MultiCatchDemo {
	private static int myArray[] = new int[5];

	public static void main(String[] args) {
		beforeJava7MultiCatch();
		afterJava7MultiCatch();

	}

	private static void afterJava7MultiCatch() {
		System.out.println("Inside afterJava7MultiCatch===============: ");
		try {
			int result =100/0;
			System.out.println("result: "+result);
			System.out.println("myArray[10]: "+myArray[10]);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
	}

	private static void beforeJava7MultiCatch() {
		System.out.println("Inside beforeJava7MultiCatch===============: ");
		try {
			int result =100/0;
			System.out.println("result: "+result);
			System.out.println("myArray[10]: "+myArray[10]);
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}

		
	}

}
