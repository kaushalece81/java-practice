package com.algorithm.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 16, 15, 5, 6, 8 };
		System.out.println("before arr ==" + Arrays.toString(arr));
		arr = sort(arr);
		System.out.println("After arr ==" + Arrays.toString(arr));

	}
	//Time complexity in best case in ascending order already  o(n power2)
	//Time complexity in worst case in descending order already o(n power2)
	public static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;  // min=0 at start
			//j=i+1 as arr[0] to be compared with arr[1]
			for(int j=i+1;j< arr.length;j++) {
				if(arr[j] < arr[min]) {
					// min changed
					min=j;
				}
			}
			if(min!=i) {
				//swap  arr[i] and arr[min]
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}

		return arr;
	}

}
