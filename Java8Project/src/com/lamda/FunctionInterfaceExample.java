package com.lamda;
@FunctionalInterface
public interface FunctionInterfaceExample {
	int add(int  a, int b);
	default int stringLength(String s) {
		return s.length();
	}
	public static int sub(int a, int b) {
		return a-b;
	}
}
