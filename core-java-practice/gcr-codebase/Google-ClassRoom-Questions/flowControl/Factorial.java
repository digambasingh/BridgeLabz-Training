package com.control.flows;

import java.util.Scanner;

//Write a Program to find the factorial of an integer entered by the user.

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		
		if(num==0) {
			System.out.println("Factorial is : "+1);
			return;
		}
		int fact = 1;
		while(num!=0) {
			fact *= num;
			num--;
			
		}
		
		System.out.println("Factorial is : "+fact);
	}

}
