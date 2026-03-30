package com.string;

import java.util.Scanner;

public class CreateSubString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the String: ");
	String str1 = sc.next();
	
	System.out.print("Enter the starting Point of String: ");
	int start = sc.nextInt();
	
   System.out.print("Enter the ending point of string: ");
	int end = sc.nextInt();
	
	String resultString = "";
	for(int i=start;i<end;i++) {
		resultString += str1.charAt(i);
	}
	
	String resultSubString = str1.substring(start,end);
	
	System.out.println("Both String are equal:"+resultString.equals(resultSubString));
	
	
}
}
