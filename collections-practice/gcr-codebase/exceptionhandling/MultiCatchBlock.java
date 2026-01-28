package com.exceptionhandling;

//Problem Statement:
//Create a Java program that performs array operations.
//Accept an integer array and an index number.
//Retrieve and print the value at that index.
//Handle the following exceptions:
//ArrayIndexOutOfBoundsException if the index is out of range.
//NullPointerException if the array is null.
//Expected Behavior:
//If valid, print "Value at index X: Y".
//If the index is out of bounds, display "Invalid index!".
//If the array is null, display "Array is not initialized!".



public class MultiCatchBlock {
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4,5,6,34,7};
		try {
			for(int i=0;i<=nums.length;i++) {
				System.out.println("Value at index " + i + " : " + nums[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("display \"Invalid index!");
		}
		catch(NullPointerException e) {
			System.out.println("Array is not initialized!");
		}
	}
}
