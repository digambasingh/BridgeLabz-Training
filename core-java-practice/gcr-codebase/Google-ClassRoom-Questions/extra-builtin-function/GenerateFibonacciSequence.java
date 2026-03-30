package com.bridgelabz.extra.scenerio;

import java.util.Scanner;


//4. Fibonacci Sequence Generator:
//○ Write a program that generates the Fibonacci sequence up to a specified number
//of terms entered by the user.
//○ Organize the code by creating a function that calculates and prints the Fibonacci
//sequence.

public class GenerateFibonacciSequence {
	
	public static void printFibonacci(int num1, int num2) {
		System.out.print(num1+num2+" ");

	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number of term of fibonacci sequence");
	int number = sc.nextInt();
	
	int first = 0;
	int second = 1;
	if(number==0) {
		return;
	}
	else if(number==1) {
		System.out.println(first);
		return;
	}
	else if(number==2) {
		System.out.println(first+" "+second);
		return;
	}
	System.out.print(first+" "+second+" ");
	for(int i=3;i<=number;i++) {
		printFibonacci(first, second);
		first = second;
		second =first+second;
	}
}
}
