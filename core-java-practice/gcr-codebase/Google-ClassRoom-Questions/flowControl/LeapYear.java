package com.control.flows;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Year: ");
	int year = sc.nextInt();
	
	if(year%100 != 0) {
		if(year%4 ==0)
		System.out.println("Is a Leap Year");
	}
	if(year%400 ==0) {
		System.out.println("Is a leap Year");
	}
	else {
		System.out.println("Is Not a Leap Year");
	}
	
}
}
