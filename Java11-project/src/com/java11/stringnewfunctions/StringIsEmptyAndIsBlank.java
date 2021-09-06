package com.java11.stringnewfunctions;

import org.apache.commons.lang3.StringUtils;
//set in classpath jar file commons-lang3-3.11.jar

public class StringIsEmptyAndIsBlank {

	public static void main(String[] args) {
		String strNull = null;
		String str1 = "";
		String str2 = " ";
		String str3 = "bob";
		String str4 = " bob ";
		// System.out.println("strNull.isEmpty() "+strNull.isEmpty()); // will throw
		// NullPointer
		System.out.println("str1.isEmpty()  " + str1.isEmpty()); // true
		System.out.println("str2.isEmpty()  " + str2.isEmpty()); // false
		System.out.println("str3.isEmpty()  " + str3.isEmpty()); // false
		System.out.println("str4.isEmpty()  " + str4.isEmpty()); // false
		System.out.println("===========================");
		// System.out.println("strNull.isBlank() "+strNull.isBlank()); // will throw
		// NullPointer
		System.out.println("str1.isBlank()  " + str1.isBlank()); // true
		System.out.println("str2.isBlank()  " + str2.isBlank()); // true this is diff consider space also blank
		System.out.println("str3.isBlank()  " + str3.isBlank()); // false
		System.out.println("str4.isBlank()  " + str4.isBlank()); // false
		
		System.out.println("===========================");

		System.out.println("StringUtils.isEmpty(null)  " + StringUtils.isEmpty(null)); // true no Null Pointer
		System.out.println("StringUtils.isEmpty(\"\")  " + StringUtils.isEmpty("")); // true
		System.out.println("StringUtils.isEmpty(\" \")  " + StringUtils.isEmpty(" ")); // false
		System.out.println("StringUtils.isEmpty(\"bob\")  " + StringUtils.isEmpty("bob")); // false
		System.out.println("StringUtils.isEmpty(\" bob \")  " + StringUtils.isEmpty(" bob ")); // false
		System.out.println("===========================");

		System.out.println("StringUtils.isBlank(null)  " + StringUtils.isBlank(null)); // true no Null Pointer
		System.out.println("StringUtils.isBlank(\"\")  " + StringUtils.isBlank("")); // true
		System.out.println("StringUtils.isBlank(\" \")  " + StringUtils.isBlank(" ")); // true
		System.out.println("StringUtils.isBlank(\"bob\")  " + StringUtils.isBlank("bob")); // false
		System.out.println("StringUtils.isBlank(\" bob \")  " + StringUtils.isBlank(" bob ")); // false

	}

}
