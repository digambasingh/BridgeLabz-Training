package com.string;

import java.util.Scanner;

public class DemonstrateNumberFormateException {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Name :");
	String name = sc.next();
	try {
		generateException(name);
	}
	catch(NumberFormatException e) {
		System.out.println("NumberFormatException is generated Successfully!");
	}
handleException(name);
}

static void generateException(String name) {
	System.out.println(Integer.parseInt(name));
}

static void handleException(String name) {
	try {
		System.out.println(Integer.parseInt(name));
		
	}
	catch(NumberFormatException e) {
		System.out.println("NumberFormatException is handle Successfully!");
	}
}
}
