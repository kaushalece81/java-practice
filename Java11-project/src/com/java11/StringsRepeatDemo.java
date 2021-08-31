package com.java11;
public class StringsRepeatDemo {
	public static void main(String[] args) {
		beforeJava11();
		fromJava11();
	}
	
	private static void fromJava11() {
		System.out.println("From Java11:");
		String javaVersion = "Java11-\n";
		System.out.println(javaVersion.repeat(5));
	}

	private static void beforeJava11() {
		System.out.println("Before Java11:");
		String javaVersion = "Java11";
		for (int i = 0; i < 5; i++) {
			System.out.println(javaVersion);
		}
	}
}
