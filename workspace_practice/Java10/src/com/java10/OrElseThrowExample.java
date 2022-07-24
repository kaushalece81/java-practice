package com.java10;

import java.util.Optional;

public class OrElseThrowExample {
	public static void main(String[] args) {
		//Optional<String> optionalString = Optional.of("kaushal");
		Optional<String> optionalString = Optional.empty();
		//optionalString.get(); // gives code smell
//		if(optionalString.isPresent()) {
//			System.out.println(optionalString.get());
//		}else {
//			System.out.println("empty value");
//		}
		
		//we should prefer this way
		System.out.println(optionalString.orElseThrow());
	}
}
