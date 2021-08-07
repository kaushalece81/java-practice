package com.lamda;

public class LamdaExpression {

	public static void main(String[] args) {
		AddI addI = (a,b) -> a+b;
		double add = addI.add(10.5, 10);
		System.out.println("add "+add);
		StringLengthI len1= s -> s.length();
		StringLengthI len2= String::length;  //method reference
		int length1 = len1.length("Kaushlender");
		System.out.println("length1 "+length1);
		int length2 = len2.length("Kaushlender");
		System.out.println("length2 "+length2);
		
		FunctionInterfaceExample funcInterface = (a,b) -> a-b;
		int sub = FunctionInterfaceExample.sub(20, 5);
		System.out.println("sub "+ sub);
		int stringLength = funcInterface.stringLength("Kaushal");
		System.out.println("stringLength "+ stringLength);
		
		var a6 ="String";
		var a7 = 1;
		

	}

}
