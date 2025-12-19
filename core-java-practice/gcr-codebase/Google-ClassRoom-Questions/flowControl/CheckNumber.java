package com.control.flows;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		// Write a program to check whether a number is positive, negative, or zero.
  
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int number  = sc.nextInt();
		
		if(number == 0) {
			System.out.println("Zero");
		}
		else if(number < 0){
			System.out.println("negative");
		}
		else {
			System.out.println("positive");
		}
	}

}
