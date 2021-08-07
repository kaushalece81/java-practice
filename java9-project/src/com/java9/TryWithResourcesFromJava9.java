package com.java9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*Solves problems
 * Resources cannot be declared outside try before java9 but from java9 we
 * can declare resources outside try also
 * */
public class TryWithResourcesFromJava9 {

	public static void main(String[] args) throws FileNotFoundException {
		beforeJava9();
		afterJava9();

	}

	private static void afterJava9() throws FileNotFoundException {
		System.out.println("Inside afterJava9===============: ");
		String currentWorkingDirectory;
		currentWorkingDirectory = System.getProperty("user.dir");
		System.out.println("Current working directory is : " + currentWorkingDirectory);
		String fileName = "File1.txt";
		File f = new File(currentWorkingDirectory + "/resource/" + fileName);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		try(fr;br ){
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void beforeJava9() throws FileNotFoundException {
		System.out.println("Inside afterJava9===============: ");
		String currentWorkingDirectory;
		currentWorkingDirectory = System.getProperty("user.dir");
		System.out.println("Current working directory is : " + currentWorkingDirectory);
		String fileName = "File1.txt";
		File f = new File(currentWorkingDirectory + "/resource/" + fileName);
		
		try(FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr)){
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
