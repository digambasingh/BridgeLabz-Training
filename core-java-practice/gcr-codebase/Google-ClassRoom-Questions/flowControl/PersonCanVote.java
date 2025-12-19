package com.control.flows;

import java.util.Scanner;
public class PersonCanVote {

	public static void main(String[] args) {
		
		// Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the person Age: ");
		int age = sc.nextInt();
		
		if(age<18) {
			System.out.println("The person's age is: "+age+" and cannot vote.");
		}
		else {
			System.out.println("The person's age is: "+age+" and can vote.");
		}
		
		

	}

}
