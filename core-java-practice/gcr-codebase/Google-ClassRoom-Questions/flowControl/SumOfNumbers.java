package com.control.flows;

import java.util.Scanner;

// Write a program to find the sum of numbers until the user enters 0

public class SumOfNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		double number = sc.nextInt();
		
		double sum = 0.0;
		while(number!=0) {
			sum += number;
			System.out.print("Enter the number: ");
			number = sc.nextInt();
		}
		System.out.println("Total Value: "+sum);

	}

}
