package com.control.flows;
import java.util.Scanner;
public class SmallestOutOfThree {

	public static void main(String[] args) {
		// Write a program to check if the first is the smallest of the 3 numbers.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number1: ");
		int number1 = sc.nextInt();
		System.out.print("Enter the Number2: ");
		int number2 = sc.nextInt();
		System.out.print("Enter the Number3: ");
		int number3 = sc.nextInt();
		boolean isSmallest = false;
		if(number1< number2 && number1< number3) {
			isSmallest = true;
		}
		
			System.out.println("Is the first number the smallest: "+ isSmallest);
	
	}

}
