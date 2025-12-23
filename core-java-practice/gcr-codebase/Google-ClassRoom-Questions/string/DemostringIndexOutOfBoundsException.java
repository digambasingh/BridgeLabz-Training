package com.string;

import java.util.Scanner;

public class DemostringIndexOutOfBoundsException {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the String: ");
	String name = sc.next();
	try {
		generateException(name);
	}
	catch(StringIndexOutOfBoundsException e) {
		System.out.println("StringIndexOutOfBounds!");
	}
	handleException(name);
	
}

public static void generateException(String name) {
	for(int i=0;i<=name.length();i++) {
		System.out.print(name.charAt(i)+" ");
	}
}
public static void handleException(String name) {
	try {
		for(int i=0;i<=name.length();i++) {
			System.out.print(name.charAt(i)+" ");
		}
	}
	catch(StringIndexOutOfBoundsException e) {
		System.out.println("StringIndexOutOfBounds!");
	}
}
}
