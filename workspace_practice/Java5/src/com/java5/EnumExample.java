package com.java5;

public class EnumExample {

	public enum Season {
		WINTER, SPRING, SUMMER, RAINY
	}

	public static void main(String[] args) {
		// traversing the enum
		for (Season s : Season.values()) {
			System.out.println(s);
		}
		System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));  
		System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());  
		System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal());  
		Season s=Season.WINTER;  
		System.out.println(s);  
	}
}
