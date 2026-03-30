package com.scenerio;

import java.util.Scanner;

public class BMIFitnessTracker {
public static void main(String[] args) {
	// This is a BMI(Body Mass Index) Fitness tracker
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to Maya Fitness!");
	
	System.out.print("Enter the weight in kg: ");
	double weight = sc.nextDouble();
	
	System.out.print("Enter the height in cm: ");
	double height = sc.nextDouble();
	
	height = height/100 ;// convert the height Centimeters to Meters
	
	double bmi = weight/(height*height);
	
	if(bmi>=40) {
		System.out.println("Obese");
	}
	else if(bmi<40 && bmi>25) {
		System.out.println("Overweight");
	}
	else if(bmi<=25 && bmi>=18) {
		System.out.println("Normal");
	}
	else {
		System.out.println("Underweight");
	}
	
}
}
