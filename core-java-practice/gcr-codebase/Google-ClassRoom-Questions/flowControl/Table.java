package com.control.flows;

import java.util.Scanner;

//Create a program to find the multiplication table of a number entered by the user from 6 to 9.

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		
		for(int i=1;i<11;i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}

	}

}
