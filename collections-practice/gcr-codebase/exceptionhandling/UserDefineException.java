package com.exceptionhandling;

//Create a custom exception called InvalidAgeException.
//Write a method validateAge(int age) that throws InvalidAgeException if the age is below 18.
//In main(), take user input and call validateAge().
//If an exception occurs, display "Age must be 18 or above".
//Expected Behavior:
//If the age is >=18, print "Access granted!".
//If age <18, throw InvalidAgeException and display the message.

import java.util.Scanner;

class InvalidAgeException extends Exception{
	
	public InvalidAgeException() {	
		super("Invalid Age");
	}
}

public class UserDefineException  {
	public static void main(String[] args) throws InvalidAgeException  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age: ");
		int age = sc.nextInt();
		validateAge(age);
		
	}
	
	public static void validateAge(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException();
		}
		else {
			System.out.println("Valid person access granted");
		}
	}
}
