package com.control.flows;
import java.util.Scanner;
public class CheckSpring {

	public static void main(String[] args) {
		// Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the month: ");
		int month = sc.nextInt();
		if(month>12 || month<1) {
			System.out.println("Invalid Input");
			return;
		}
		
		System.out.println("Enter the date of Month: ");
		int day = sc.nextInt();
		if(day>31 || month<1) {
			System.out.println("Invalid Input");
			return;
		}
		if(month==2 && day >29) {
			System.out.println("Invalid Input");
			return;
		}
		
		if(month>3 && month<6) {
			System.out.println("Spring Season");
		}
		else if(month == 3 && day >= 20) {
			System.out.println("Spring Season");
		}
		else if(month == 6 && day <= 20) {
			System.out.println("Spring Season");
		}
		else {
			System.out.println("Not a Spring Season");
		}
	
	}

}
