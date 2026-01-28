package com.exceptionhandling;

//Unchecked Exception (Runtime Exception)
// Problem Statement:
//Write a Java program that asks the user to enter two numbers and divides them. Handle possible exceptions such as:
//ArithmeticException if division by zero occurs.
//InputMismatchException if the user enters a non-numeric value.
//Expected Behavior:
//If the user enters valid numbers, print the result of the division.
//
//If the user enters 0 as the denominator, catch and handle ArithmeticException.
//If the user enters a non-numeric value, catch and handle InputMismatchException.


import java.util.Scanner;
import java.util.InputMismatchException;

public class CheckRuntimeException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the input1:");
			int number1 = sc.nextInt();
			System.out.println("Enter the input2:");
			int number2 = sc.nextInt();
			int sum = number1+number2;
			System.out.println("Sum of Numbers: " + sum);
			int div = number1/number2;
			System.out.println("divide of Numbers: " + div);
		}
		catch(ArithmeticException e) {
			System.out.println("UnDefined");
		}
		catch(InputMismatchException e) {
			System.out.println("please enter the input");
		}
	}
}
