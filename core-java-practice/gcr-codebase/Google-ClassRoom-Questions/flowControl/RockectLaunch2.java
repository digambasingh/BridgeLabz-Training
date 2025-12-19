package com.control.flows;
//Write a program to count down the number from the user input value to 1 using a for loop for a rocket launch
import java.util.Scanner;
public class RockectLaunch2 {

	public static void main(String[] args) throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		int number = sc.nextInt();
		for(int i = number; i>0; i--) {
			System.out.println(i);
			Thread.sleep(700);
		}
		System.out.println("Rockect Launch");

	}

}
