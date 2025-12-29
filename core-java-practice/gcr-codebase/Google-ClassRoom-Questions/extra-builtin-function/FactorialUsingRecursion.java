package com.bridgelabz.extra.scenerio;

import java.util.Scanner;

//6. Factorial Using Recursion:
//○ Write a program that calculates the factorial of a number using a recursive
//function.
//○ Include modular code to separate input, calculation, and output processes.

public class FactorialUsingRecursion {

	static int factoralNumber(int number) {
		if(number==0)return 1;
		return number*factoralNumber(number-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to find the factorial:");
		int number = sc.nextInt();
		
		System.out.println("factorial of the "+number+" is "+factoralNumber(number));
	}
}
