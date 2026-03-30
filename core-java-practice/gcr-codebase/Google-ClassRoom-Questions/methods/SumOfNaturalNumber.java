package com.bridgelabz.methods;

//Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct. 
//Hint => 
//Take the user input number and check whether it's a Natural number
//Write a Method to find the sum of n natural numbers using recursion
//Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2 
//Compare the two results and print the result

import java.util.Scanner;

public class SumOfNaturalNumber {
	static int sum =0;
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number: ");
	int num = sc.nextInt();
	
System.out.println("Sum of Natural Number by recursion: "+ sumOfNaturalNumberByRecursion(num));
	
System.out.println("Sum of Natural Number by Formula: "+ SumOfNaturalNumber(num));

System.out.println("Both are equal: "+(SumOfNaturalNumber(num)==sumOfNaturalNumberByRecursion(num)));

}
public static int sumOfNaturalNumberByRecursion(int number) {
	if(number==0) {
		return number;
	}
	return number+sumOfNaturalNumberByRecursion(number-1);
}

public static int SumOfNaturalNumber(int number) {
	return number*(number+1)/2;
}
}
