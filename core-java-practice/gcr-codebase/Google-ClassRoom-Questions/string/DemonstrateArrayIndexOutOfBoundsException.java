package com.string;

public class DemonstrateArrayIndexOutOfBoundsException {
public static void main(String[] args) {
	String[] fruits = {"Apple","Banan","Cherry"};
	try {
		generateException(fruits);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException is generated successfully!");
	}
	handleException(fruits);
}

static void generateException(String[] fruits) {
	for(int i=0;i<=fruits.length;i++) {
		System.out.println(fruits[i]);
	}
}

static void handleException(String[] fruits) {
	try {
		for(int i=0;i<=fruits.length;i++) {
			System.out.println(fruits[i]);
		}
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException is handle successfully!");
	}
}
}
