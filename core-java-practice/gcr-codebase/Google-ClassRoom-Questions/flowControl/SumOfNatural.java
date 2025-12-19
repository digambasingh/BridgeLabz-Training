package com.control.flows;
import java.util.Scanner;

public class SumOfNatural {

	public static void main(String[] args) {
		// Write a program to check for the natural number and write the sum of n natural numbers 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        
        boolean isNatural = true;
        
        int sum = number*((number+1)/2);
        
        if(number<=0) {
        	System.out.println("The number : "+ number+" is not a natural number");
        }
        
        else {
           System.out.println("The sum of: "+number+" natural number is : "+sum);
        }
	}

}
