package com.java8.optional;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		String name= null;
		Optional<String> optionalStr= Optional.ofNullable(name);
		System.out.println(optionalStr.isPresent());
		System.out.println(optionalStr.isEmpty());
		
		
		Optional<String> optionalValue= Optional.of("Kaushlender");  // throws NullPointer is value null
		System.out.println(optionalValue.isPresent());
		if(optionalValue.isPresent()) {
			System.out.println("optionalValue.get(): "+optionalValue.get());
		}
		
		String nullName = null;
	    String name1 = Optional.ofNullable(nullName).orElse("john");
	    System.out.println(name1.equals("john"));
	    
	    String nullName2 = null;
	    String name2 = Optional.ofNullable(nullName2).orElseGet(() -> "john");
	    System.out.println(name2.equals("john"));

	}

}
