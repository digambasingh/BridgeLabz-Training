package com.string;

import java.util.Scanner;

public class ConvertToUpperCase {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the text: ");
	String text = sc.nextLine();
	String textCompare = UserDefineMethod(text);
	if(text.equals(textCompare)) {
		System.out.println("String are "+text.equals(textCompare));
	}
	
}

static String UserDefineMethod(String name) {
	String result = "";
	for(int i=0;i<name.length();i++) {
		if(name.charAt(i)>'Z') {
			result+= (char)(name.charAt(i)-32);
		}
		else {
			result += name.charAt(i);
		}
	}
	
	System.out.println("Your string is :"+result);
	return result;
}
}
