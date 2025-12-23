package com.string;

import java.util.Scanner;

public class PalindromeString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the text: ");
	String text = sc.next();
	System.out.println("your text is palindrome: "+isPalindrome(text));
	
}
public static boolean isPalindrome(String text) {
	int start = 0;
	int end = text.length()-1;
	
	while(start<end) {
		if(text.charAt(start)!= text.charAt(end))return false;
		start++;
		end--;
	}
	return true;
}
}
