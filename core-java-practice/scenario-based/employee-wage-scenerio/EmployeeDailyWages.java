package com.bridgelabz.employeewage;

import java.util.Scanner;

// wage per hours is 20 rupees 
// daily hours work is 8 hours
public class EmployeeDailyWages {
	
public static void main(String[] args) {
	final int WAGE_PER_HOURS = 20;
	final int WORK_HOURS = 8;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the number daily hours: ");
	int dailyHours = sc.nextInt();
	while(true) {
	if(dailyHours<0 || dailyHours>24) {
		System.out.println("Please enter the valid hours(0-24) ");
		dailyHours = sc.nextInt();
		continue;
	 }
	else {
		break;
	}
	}

	
	System.out.println("your Wage is According to your daily hours: "+ dailyHours*WAGE_PER_HOURS);
	System.out.println("your Full day wage is: "+WORK_HOURS*WAGE_PER_HOURS);
	
	sc.close();
}
}
