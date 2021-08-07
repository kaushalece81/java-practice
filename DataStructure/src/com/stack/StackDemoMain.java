package com.stack;

import java.util.Scanner;

public class StackDemoMain {
	private static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
		StackDemo stackDemo =new StackDemo();
		while(true) {
		
		System.out.println("1. Push ===============");
		System.out.println("2. Pop ===============");
		System.out.println("3. Peek ===============");
		System.out.println("4. Traverse ===============");
		System.out.println("5. Quit ===============");
		System.out.println("Enter your choice ===============");
		int optionSelectedNow =0 ;
		try {
		optionSelectedNow = scanner.nextInt();
		System.out.println("optionSelectedNow = "+optionSelectedNow);
		}catch(Exception e) {
			System.out.println("Input Mismatch Exception please enter only integer values");
		}
		int ch;
		switch(optionSelectedNow) {
		case 1: 
				System.out.println("Enter the element: ");
				int element = scanner.nextInt();
				stackDemo.push(element);
				break;
		case 2:
			int popElement = stackDemo.pop();
			if(popElement==0) {
				System.out.println("Stack is underflow");
			}else {
				System.out.println("Popped element: "+popElement);
			}
			break;
		case 3:
			stackDemo.peek();
			break;
		case 4: 
			stackDemo.traverse();
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid option");
		}
		}
	}

}
