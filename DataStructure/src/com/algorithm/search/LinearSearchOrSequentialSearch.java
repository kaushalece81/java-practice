package com.algorithm.search;

public class LinearSearchOrSequentialSearch {

	// linear search works for both sorted array as well as unsorted array
	public static void main(String[] args) {
		int[] arr = { 16, 15, 5, 6, 8, 67, 42 };
		int data = 100;
		System.out.println("index of data is  ==" + search(arr,data));

	}

	//Time complexity in best case  o(1)
	//Time complexity in worst case o(n)
	public static int search(int[] arr,int data) {
		int indexOfData=-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==data) {
				indexOfData=i;
			}
		}
		if(indexOfData==-1)
		{
			System.out.println("Data not found");
		}

		return indexOfData;
	}

}
