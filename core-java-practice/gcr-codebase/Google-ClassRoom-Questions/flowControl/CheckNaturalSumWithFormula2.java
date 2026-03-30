package com.control.flows;

import java.util.Scanner;

//Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 

public class CheckNaturalSumWithFormula2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		if(number <=0) {
			System.out.println("Please Enter the Natural Number.");
			return;
		}
		
		int num = number;
		int sum = 0;
		
		for(int i=1;i<=number;i++) {
			sum += i;
		
		}
		
		int sumByFormula = num*(num+1)/2;
		if(sum == sumByFormula) {
			System.out.println("The total Value: "+sum);
		}
     sc.close();
	}

}
