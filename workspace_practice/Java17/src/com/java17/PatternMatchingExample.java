package com.java17;

public class PatternMatchingExample {

	public static void main(String[] args) {
		System.out.println("formatter called : "+ formatter(3.0));
		System.out.println("formatterPatternSwitch called : "+ formatterPatternSwitch(3.0));
		
	}

	static String formatter(Object obj) {
		String formatted ="unknown";
		if(obj instanceof Integer i) {
			formatted = String.format("Integer %d", i);
		}else if(obj instanceof Long l) {
			formatted = String.format("long %d", l);
		}else if(obj instanceof Double d) {
			formatted = String.format("Double %f", d);
		}else if(obj instanceof String s) {
			formatted = String.format("String %s", s);
		}
		return formatted;
	}
	
	static String formatterPatternSwitch(Object obj) {
		return switch(obj) {
		case Integer i -> String.format("Integer %d", i);
		case Long l -> String.format("Long %d", l);
		case Double d -> String.format("Double %f", d);
		case String s -> String.format("String %s", s);
		default obj.toString();
		};
	}
}
