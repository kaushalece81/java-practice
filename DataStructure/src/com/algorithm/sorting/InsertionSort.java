package com.algorithm.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// int[] arr = { 4, 2, 7, 9, 3, 1, 5, 8, 6 };
		int[] arr = { 16, 15, 5, 6, 8 };
		System.out.println("before arr ==" + Arrays.toString(arr));
		arr = sort(arr);
		System.out.println("After arr ==" + Arrays.toString(arr));

	}
//Time complexity in best case in ascending order already o(n)
//Time complexity in worst case in descending order already o(n power2)
	public static int[] sort(int[] arr) {
		//starting with i=1 as first element is considered in sorted array rest unsorted
		for (int i = 1; i < arr.length; i++) {
			int temp =arr[i];
			// j is index of sorted array with which to compare temp value
			int j= i-1;
			while (j>=0 && arr[j] > temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}

		return arr;
	}

}
