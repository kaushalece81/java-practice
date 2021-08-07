package com.java7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*Solves problems
 * Manages resources implicitly
 * No need for developer to close resources explicitly
 * */
public class TryWithResources {

	public static void main(String[] args) {
		beforeJava7();
		afterJava7();

	}

	private static void afterJava7() {
		System.out.println("Inside afterJava7===============: ");
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

	private static void beforeJava7() {
		System.out.println("Inside beforeJava7===============: ");
		String currentWorkingDirectory;
		currentWorkingDirectory = System.getProperty("user.dir");
		System.out.println("Current working directory is : " + currentWorkingDirectory);

		String fileName = "File1.txt";
		File f = new File(currentWorkingDirectory + "/resource/" + fileName);
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(f);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		br = new BufferedReader(fr);
		String str;
		try {
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}
