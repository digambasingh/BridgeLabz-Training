package com.control.flows;

import java.util.Scanner;

//Write a Program to find the factorial of an using for loop entered by the user.

public class Factorial2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		
		if(num<0) {
			System.out.println("Please Enter number positive");
			return;
		}
		if(num==0) {
			System.out.println("Factorial is : "+1);
			return;
		}
		int fact = 1;
		for(int i = num;i>0;i--) {
			fact *= i;
			
		}
		
		System.out.println("Factorial is : "+fact);
	}

}
