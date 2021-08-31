package com.java10;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashMap;

public class VarDemo {

	public static void main(String[] args) throws IOException {

		// Before Java10
		String firstName = "Java";
		String lastName = "FastForward";
		Date dateOfBirth = new Date();
		int salary = 50000;
		URL url = new URL("http://javafastforward.com/");
		URLConnection urlConnection = url.openConnection();

		// From Java10

		var firstName2 = "Java";
		var lastName2 = "FastForward";
		var dateOfBirth2 = new Date();
		var salary1 = 40000;
		var salary2 = 50000;
		var url2 = new URL("http://javafastforward.com/");
		var urlConnection2 = url.openConnection();
		//var strWithNull= null;
		// compilation error Cannot infer type for local variable initialized to 'null'Cannot infer type for local variable initialized to 'null'

		// Compiler infers based on the values and perform the required operation
		System.out.println(salary2 + salary2);
		System.out.println(firstName2 + lastName2);

		// Before Java10
		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();

		// From Java10
		var studentMap1 = new HashMap<>();

		// Before Java10
		String stringWithNoInitiazation;
		String stringWithNull = null;

		// From Java10
		// var stringWithNoInitiazation1;
		// var stringWithNull1 = null;
		

		System.out.println(salary1 + salary2);// 90000
		System.out.println(firstName2 + lastName2);// JavaFastForward
		
		
		//Can we achieve similar functionality from Code#1 and Code#2 ?
		//Code #1 
		HashMap<Integer, String> studentMap2 = new HashMap<Integer, String>();
		//Code #2 
		var studentMap3 = new HashMap<>();

	}
}