package com.exceptionhandling;

//Problem Statement:
//Create a method calculateInterest(double amount, double rate, int years) that:
//Throws IllegalArgumentException if amount or rate is negative.
//Propagates the exception using throws and handles it in main().
//Expected Behavior:
//If valid, return and print the calculated interest.
//If invalid, catch and display "Invalid input: Amount and rate must be positive".

import java.util.Scanner;
class IllegalArgumentException extends Exception{
	public IllegalArgumentException() {
		super("Invalid input: Amount and rate must be positive");
	}
}

public class CalculateInterest {
	public static void main(String[] args) throws IllegalArgumentException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		double amount = sc.nextDouble();
		System.out.println("Enter the rate");
		double rate = sc.nextDouble();
		
		System.out.println("Enter the year");
		int year = sc.nextInt();
		
		calculateInterest(amount,rate,year);
	}
	
	public static void calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
		if(amount<0 || rate <0) {
			throw new IllegalArgumentException();
		}
		else {
			double interest = (amount*rate*years)/1000;
			System.out.println(interest);
		}
	}
}
