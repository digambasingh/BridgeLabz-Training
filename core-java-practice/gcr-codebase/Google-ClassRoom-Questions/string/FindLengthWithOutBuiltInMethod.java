package com.string;

import java.util.Scanner;

public class FindLengthWithOutBuiltInMethod {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Text: ");
	String text = sc.next();
	
	int len = findLength(text);
	System.out.println("User define length: "+len);
	System.out.println("built In length: "+text.length());
	
}

public static int findLength(String text) {
	int count =0;
	try {
	int i=0;
	while(true) {
		text.charAt(i);
		count++;
		i++;
	}
	}
	catch(RuntimeException e) {
		return count;
	}
}
}
