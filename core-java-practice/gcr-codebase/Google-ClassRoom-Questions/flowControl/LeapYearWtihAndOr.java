package com.control.flows;

import java.util.Scanner;

public class LeapYearWtihAndOr {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Year: ");
	int year = sc.nextInt();
	
	if((year%100 !=0 && year%4 ==0) || year%400 ==0) {
		System.out.println("Is a Leap Year!");
	}
	else {
		System.out.println("Is Not Leap Year!");
	}
}
}
