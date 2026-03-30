package com.control.flows;

import java.util.Scanner;

public class CheckArmString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int number = sc.nextInt();
	int number1 = number;
	int sum = 0;
	while(number>0) {
		int digit = number%10;
		sum += Math.pow(digit, 3);
		number = number/10;
	}
	if(sum == number1) {
		System.out.print("is ArmStrong!");
	}
	else {
		System.out.print("is not ArmStrong!");

	}
	
}
}
