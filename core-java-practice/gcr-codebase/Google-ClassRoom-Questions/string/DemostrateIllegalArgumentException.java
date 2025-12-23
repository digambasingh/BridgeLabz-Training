package com.string;

import java.util.Scanner;

public class DemostrateIllegalArgumentException {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Name: ");
	String name = sc.next();
	try {
		generateException(name);
	}
	catch(IllegalArgumentException e) {
		System.out.println("IllegalArgument Exception!");
	}
	catch(RuntimeException e) {
		System.out.println("Runtime exception! is generated");
	}
	handleException(name);
}

public static void generateException(String name) {
	System.out.println(name.substring(1,0));
}

static void handleException(String name) {
	try {
		System.out.println(name.substring(1,0));
	}
	catch(IllegalArgumentException e) {
		System.out.println("IllegalArgument Exception!");
	}
	catch(RuntimeException e) {
		System.out.println("Runtime exception!");
		System.out.println("Exception is handle successfully!");
	}
}
}
