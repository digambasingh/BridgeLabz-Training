package com.bridgelabz.extra.scenerio;

import java.util.Scanner;

//Prime Number Checker:
//○ Create a program that checks whether a given number is a prime number. ○
//The program should use a separate function to perform the prime check and
//return the result.

public class PrimeNumberChecker {
	
	public static boolean checkPrime(int number) {
		if(number ==1)return false;
		
		for(int i=2;i<=Math.sqrt(number);i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number for check is prime or not");
	int number = sc.nextInt();
	boolean isPrime = checkPrime(number);
	if(isPrime) {
		System.out.println("this number: "+number+" is prime-> "+isPrime);
	}
	else {
		System.out.println("this number: "+number+" is prime-> "+isPrime);
	}
}
}
