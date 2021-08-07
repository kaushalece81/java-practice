package com.algorithm.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// int[] arr = { 4, 2, 7, 9, 3, 1, 5, 8, 6 };
		int[] arr = { 16, 15, 5, 6, 8 };
		System.out.println("before arr ==" + Arrays.toString(arr));
		arr = sort(arr);
		System.out.println("After arr ==" + Arrays.toString(arr));

	}
//Here more number of iteration occurs hence introduced j < arr.length - 1 - i below
//	public static int[] sort(int[] arr) {
//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j = 0; j < arr.length - 1; j++) {
//				if (arr[j] > arr[j + 1]) {
//					swap(arr, j);
//				}
//			}
//		}
//
//		return arr;
//	}

//	public static int[] sort(int[] arr) {
//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j = 0; j < arr.length - 1 - i; j++) {
//				if (arr[j] > arr[j + 1]) {
//					swap(arr, j);
//				}
//			}
//		}
//
//		return arr;
//	}
	// to optimize bubble sort in case in any pass no swapping happens then its
	// sorted
	//Time complexity in best case in ascending order already o(n)
	//Time complexity in worst case in descending order already o(n power2)
	public static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int flagSwapHappened = 0;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j);
					flagSwapHappened = 1;
				}
			}
			// check if swap occured or not
			if (flagSwapHappened==0) {
				break;
			}
		}

		return arr;
	}

	private static void swap(int[] arr, int j) {
		int temp = arr[j];
		arr[j] = arr[j + 1];
		arr[j + 1] = temp;
	}

}
