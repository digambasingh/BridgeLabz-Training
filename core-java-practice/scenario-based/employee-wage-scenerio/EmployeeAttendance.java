package com.bridgelabz.employeewage;

import java.util.Random;
import java.util.Scanner;

public class EmployeeAttendance {
	static int presentCount=0;
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Number of Employees: ");
	int EmployeeNumber = sc.nextInt();
	
	for(int i=0;i<EmployeeNumber;i++) {
		attendanceTeacher();
	}
	System.out.println("Total present: "+presentCount);
}

static void attendanceTeacher() {
	Random random=new Random();
	int num = random.nextInt(2);
	
	if(num==1) {
		System.out.println("present");
		presentCount++;
	}
	else {
		System.out.println("abesent");
	}
	
}
}
