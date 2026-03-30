package com.control.flows;

import java.util.Scanner;

// Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement


public class SumofNumbers2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		double number = sc.nextInt();
		
		double sum = 0.0;
		while(number!=0) {
			sum += number;
			System.out.print("Enter the number: ");
			number = sc.nextInt();
			if(number<0) break;
		}
		
		System.out.println("Total Value: "+sum);
	}

}
