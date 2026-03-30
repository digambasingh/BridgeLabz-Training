package com.control.flows;

import java.util.Scanner;

public class BMI {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Wieght in Kg: ");
	double weight = sc.nextDouble();
	
	System.out.print("Enter the height in (cm): ");
	double height = sc.nextDouble();
	height = height/100;
	double bmi = weight/(height*height);
	
	if(bmi>=40) {
		System.out.println("Your BMI is:"+bmi+" Obese");
	}
	else if(bmi<39.9 && bmi>25) {
		System.out.println("Your BMI is:"+bmi+" OverWeight");
	}
	else if(bmi<24.9 && bmi>18.5) {
		System.out.println("Your BMI is:"+bmi+" Normal");
	}
	else {
		System.out.println("Your BMI is:"+bmi+" Under weight");
	}
}
}
