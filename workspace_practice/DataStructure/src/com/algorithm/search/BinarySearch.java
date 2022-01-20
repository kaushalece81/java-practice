package com.algorithm.search;

public class BinarySearch {

	// prequiste array should be sorted in ascending order
	public static void main(String[] args) {
		int[] arr = { 6, 8, 9, 16, 18, 42, 52, 69, 90 };
		int n = arr.length;
		int data = 90;
		// Floor value of((L+R)/2)=mid index
		// case1 data == a[mid]
		// case2 data < a[mid]
		// case3 data > a[mid]
		System.out.println("index of data is  ==" + search(arr, n, data));

	}

	// Time complexity in best case o(1)
	// Time complexity in worst case o(log n)
	public static int search(int[] arr, int sizeOfArray, int data) {
		int l = 0; // left
		int r = sizeOfArray; // right

		while (l < r) {
			int mid = (l + r) / 2;
			if (data == arr[mid]) {
				return mid;
			} else if (data < arr[mid]) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return -1;
	}

}
