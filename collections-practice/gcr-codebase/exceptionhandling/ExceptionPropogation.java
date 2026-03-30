package com.exceptionhandling;

//Problem Statement:
//Create a Java program with three methods:
//method1(): Throws an ArithmeticException (10 / 0).
//method2(): Calls method1().
//main(): Calls method2() and handles the exception.
//Expected Behavior:
//The exception propagates from method1() → method2() → main().
//Catch and handle it in main(), printing "Handled exception in main".

public class ExceptionPropogation {
	public static void main(String[] args) {
		try{
			m1();
		}
		catch(Exception e) {
			System.out.println("handle");
		}
	}
	public static void m1() {
		m2();
	}
	public static void m2() {
		int num1 = 15;
		int num2 = 0;
		int res = num1/num2;
	}
}
