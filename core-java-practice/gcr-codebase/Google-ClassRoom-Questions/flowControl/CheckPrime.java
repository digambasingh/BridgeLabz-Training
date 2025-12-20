package com.control.flows;

import java.util.Scanner;

public class CheckPrime {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Number: ");
	int number = sc.nextInt();
	if(number ==1) {
		System.out.println("not a pime number");
		return;
	}
	for(int i =2;i<number;i++) {
		if(number%i ==0) {
			System.out.println("Not a Prime Number!");
			return;
		}
	}
	System.out.println("is Prime number!");
	
	
	
}
}
