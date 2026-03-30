package com.control.flows;
import java.util.Scanner;
public class CheckDivisility {

	public static void main(String[] args) {
		// Write a program to check if a number is divisible by 5
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		if(number%5 == 0) {
			System.out.println("Is the Number: "+number+" divisible by 5 : "+ "yes");
		}
		else {
			System.out.println("Is the Number: "+number+" divisible by 5 : "+ "No");
		}
		

	}

}
