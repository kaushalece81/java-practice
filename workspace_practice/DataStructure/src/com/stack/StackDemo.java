package com.stack;

import java.util.Scanner;

public class StackDemo {
	private static int CAPACITY = 0;
	private static int stackArray[];
	private static Scanner scanner= new Scanner(System.in);
	private int top = -1;
	
	static {
		create();
	}

	public void push(int element) {
		if (isFull()) {
			System.out.println("Stack is overflow");
		} else {
			top++;
			stackArray[top] = element;
			System.out.println("Pushed element in stack: " + element);
		}
	}

	private static void create() {
		System.out.println("Enter the stack size: ");
		int size = scanner.nextInt();
		CAPACITY = size;
		stackArray = new int[size];
	}

	private boolean isFull() {
		return top == (CAPACITY - 1);
	}

	// return top element and delete that element
	public int pop() {
		if (isEmpty()) {
			return 0;
		} else {
			return stackArray[top--];
			// first it will return top element then decrease top by 1
		}
	}

	// return top element and but not delete that element
	public void peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Peeked element is : " + stackArray[top]);
		}
	}
	
	public void traverse() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.print("Stack elements are: ");
			for(int i=top ; i>=0; i--) {
				System.out.print(stackArray[i]+" ");
			}
			System.out.println();
		}
	}

	private boolean isEmpty() {
		return top == -1;
	}

}
