package com.bridgelabz.employeewage;

import java.util.Scanner;
import java.util.Random;
// wage per hours is 20 rupees 
// daily hours work is 8 hours
// here partime employee

public class EmployeeWageInMonth {
		
	public static void main(String[] args) {
		final int EMP_WAGE_PER_HOUR = 20;
		final int WORKING_HOURS_IN_MONTH = 20;
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();
		int workHours = 0; 
		int isWhatType = (int)random.nextInt(3);
		switch(isWhatType) {
		case 1:{
			int IS_PARTIME_WORK = 1;
			workHours = 5;
			break;
		}
		case 2:{
			int IS_FULL_TIME = 2;
			 workHours = 8;
			 break;
		}
		default:{
			System.out.print("Enter the number daily hours: ");
			 workHours = sc.nextInt();
			 break;
		}
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
		
		System.out.println("your wage in a day is : "+workHours*EMP_WAGE_PER_HOUR);
		System.out.println("your wage in a month is : "+workHours*EMP_WAGE_PER_HOUR*WORKING_HOURS_IN_MONTH);

	}
	}

