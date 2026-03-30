package com.exceptionhandling;

//Problem Statement:
//Write a program that performs integer division and demonstrates the finally block execution.
//The program should:
//Take two integers from the user.
//Perform division.
//Handle ArithmeticException (if dividing by zero).
//Ensure "Operation completed" is always printed using finally.
//Expected Behavior:
//If valid, print the result.
//If an exception occurs, handle it and still print "Operation completed".


import java.util.Scanner;
public class FinallyBlockExecution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Integer1: ");
		int integer1 = sc.nextInt();
		System.out.println("Enter the first Integer2: ");
		int integer2 = sc.nextInt();
		
		try {
			int res = integer1/integer2;
			System.out.println(res);
		}
		catch(ArithmeticException e) {
			System.out.println("Handle ArithmeticException successfully");
		}
		finally {
			System.out.println("Operation completed");
		}
	}
}
