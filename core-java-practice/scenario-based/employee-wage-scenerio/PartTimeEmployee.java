package com.bridgelabz.employeewage;

import java.util.Scanner;
import java.util.Random;
// wage per hours is 20 rupees 
// daily hours work is 8 hours
// here partime employee

public class PartTimeEmployee {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int IS_PARTIME_WORK = 1;
		final int IS_FULL_TIME = 2;
		final int EMP_WAGE_PER_HOUR = 20;
		int workHours = 8;
		
		Random random = new Random();
		int isWhatType = random.nextInt(3);
		if(isWhatType==IS_PARTIME_WORK) {
			System.out.println("you are part Time Employee!");
			workHours = 5;
		}
		else if(isWhatType==IS_FULL_TIME) {
			System.out.println("you are Full Time Employee!");
			workHours = 8;
		}
		else {
			System.out.print("Enter the number daily hours: ");
			 workHours = sc.nextInt();
		}
	
		
		while(true) {
		if(workHours>24 || workHours<0) {
			System.out.print("Please enter the valid hours");
			workHours = sc.nextInt();
			continue;
		 }
		else {
			break;
		}
		}
		
		System.out.println("your wage is: "+workHours*EMP_WAGE_PER_HOUR);
		
	}
	}
