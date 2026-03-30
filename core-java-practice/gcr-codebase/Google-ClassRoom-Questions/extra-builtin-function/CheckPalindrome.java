package com.bridgelabz.extra.scenerio;

import java.util.Scanner;

//Palindrome Checker:
//○ Write a program that checks if a given string is a palindrome (a word, phrase, or
//sequence that reads the same backward as forward).
//○ Break the program into functions for input, checking the palindrome condition,
//and displaying the result.

public class CheckPalindrome {

static boolean checkPalindrome(String text) {
	
	int left = 0;
	int right = text.length()-1;
	
	while(left<=right) {
		if(text.charAt(left)!=text.charAt(right))return false;
		left++;
		right--;
	}
	
	return true;
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the string to check palindrome:");
	String text = sc.nextLine();
	boolean isPalindrome = checkPalindrome(text);
	if(isPalindrome) {
		System.out.println("Given string is palindrome!");
	}
	else {
		System.out.println("Given string is not Palindrome!");
	}
}

}
