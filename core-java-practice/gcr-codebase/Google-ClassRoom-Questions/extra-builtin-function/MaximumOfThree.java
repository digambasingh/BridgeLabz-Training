package com.bridgelabz.extra.scenerio;

import java.util.Scanner;

//Maximum of Three Numbers:
//○ Write a program that takes three integer inputs from the user and finds the
//maximum of the three numbers.
//○ Ensure your program follows best practices for organizing code into modular
//functions, such as separate functions for taking input and calculating the
//maximum value.

public class MaximumOfThree {

	public static int findMaximum(int num1, int num2, int num3) {
		return Math.max(num1, Math.max(num2, num3));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number1");
		int integer1 = sc.nextInt();
		
		System.out.println("Enter the Number2");
		int integer2 = sc.nextInt();
		
		System.out.println("Enter the Number3");
		int integer3 = sc.nextInt();
		
		System.out.println("Maximum Number is: "+findMaximum(integer1, integer2, integer3));
	}
	
}
