package com.java7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/*problems
 * No proper exception handling
 * performance issue
 * code is verbose and complex code
 * methods not consistent with all operation system
 * Need to close FileInputStream
 * 
 * Solves problem
 * FileInputStream not required
 * code is simple
 * Need to close Files
 * */
public class NewFileSystemApiNIO {

	public static void main(String[] args) {
		beforeJava7();
		afterJava7();

	}

	private static void afterJava7() {
		System.out.println("Inside afterJava7===============: ");
		String currentWorkingDirectory;
		currentWorkingDirectory = System.getProperty("user.dir");
		System.out.println("Current working directory is : " + currentWorkingDirectory);
		String fileName = "File2.txt";
		File f = new File(currentWorkingDirectory + "/resource/" + fileName);
		
		System.out.println("Writing file");
		
		try  {
			String contentToWrite="Hello Bhai writing to a file 2";
			Path path= Paths.get(f.getPath());
			Files.write(path, contentToWrite.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Reading file");
		try  {
			String content;
			Path path= Paths.get(f.getPath());
			content = new String(Files.readAllBytes(path));
			System.out.println(content);
			List<String> list = Files.readAllLines(path);
			System.out.println(list);
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
		
		System.out.println("Writing file============================");
		String contentToWrite="Hello Bhai writing to a file1";
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(f);
			fos.write(contentToWrite.getBytes());
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
		System.out.println("Reading file============================");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			System.out.println();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
	}

}
