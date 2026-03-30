package com.string;

public class DemoNullPointerException {
public static void main(String[] args) {
	String name = null;
	try {
	System.out.println(	name.length());
	}
	catch(NullPointerException e) {
		System.out.println("String is null");
		System.out.println("NullPointerException!");
		
	}
	
}
}
