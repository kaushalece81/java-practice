package com.java5;

public class GenericTest {

	public static void main(String[] args) {

		GenericCalculator<Integer> obj =new GenericCalculator<>();
		System.out.println(obj.addNumbers(50, 60));
		GenericCalculator<Double> obj1 =new GenericCalculator<>();
		System.out.println(obj1.addNumbers(55.02, 60.60));
		GenericCalculator<Long> obj2 =new GenericCalculator<>();
		System.out.println(obj2.addNumbers(50L, 60L));
		GenericCalculator<String> obj3 =new GenericCalculator<>();
		System.out.println(obj3.addNumbers("50", "60"));
		

	}

}
