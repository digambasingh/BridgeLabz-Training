package com.control.flows;
import java.util.Scanner;
public class ChecklargestOutOfThree {

	public static void main(String[] args) {
		// Write a program to check if the first, second, or third number is the largest of the three.
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the Number1: ");
         int number1 = sc.nextInt();
         System.out.print("Enter the Number2: ");
         int number2 = sc.nextInt();
         System.out.print("Enter the Number3: ");
         int number3 = sc.nextInt();
         
         System.out.print("is the first NUmber the largest? ");
         System.out.println(number1>number2 && number1>number3);
         
         System.out.print("is the first NUmber the largest? ");
         System.out.println(number2>number1 && number2>number3);
         
         System.out.print("is the first NUmber the largest? ");
         System.out.println(number3>number1 && number3>number2);
         
	}

}
