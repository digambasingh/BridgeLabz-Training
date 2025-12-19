package com.control.flows;

import java.util.Scanner;

public class RocketLaunch {

	public static void main (String[] args) throws InterruptedException{
		// Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
 
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		while(number>0) {
			System.out.println(number);
			Thread.sleep(800);
			number--;
		}
		System.out.println("Rockect Launch");

	}

}
