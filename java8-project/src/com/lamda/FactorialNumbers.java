package com.lamda;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class FactorialNumbers {

	public static void main(String[] args) {
		long factorialUsingStreams = factorialUsingStreams(5);
		System.out.println(factorialUsingStreams);
		
		long factorialUsingStreams1 = factorialUsingIntStreams(6);
		System.out.println(factorialUsingStreams1);

	}

	public static long factorialUsingStreams(int n) {
	    return LongStream.rangeClosed(1, n)   // in rangeClosed end is inclusive
	        .reduce(1, (long x, long y) -> x * y);
	}
	
	public static long factorialUsingIntStreams(int n) {
	    return IntStream.range(1, n)     // in range end is exclusive
	        .reduce(1, ( x,  y) -> x * y);
	}
	
//	public static long factorialUsingStreams(int n) {
//	    return LongStream.rangeClosed(1, n)
//	        .reduce(1, (long x, long y) -> {
//	        	System.out.println("x="+x);
//	        	System.out.println("y="+y);
//	        	return x * y;
//	        	});
//	}
	

	
//	public static long factorialUsingIntStreams(int n) {
//	    return IntStream.range(1, n)
//	        .reduce(0, ( x,  y) -> {
//	        	System.out.println("x="+x);
//	        	System.out.println("y="+y);
//	        	return x + y;
//	        });
//	}
	
	
}
