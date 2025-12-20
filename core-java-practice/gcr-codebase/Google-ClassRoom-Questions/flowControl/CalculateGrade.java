package com.control.flows;

import java.util.Scanner;

// Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 
public class CalculateGrade {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Marks of Physics: ");
	int physicsMarks = sc.nextInt();
	
	System.out.print("Enter the Marks of Chemistry: ");
	int chemistryMarks = sc.nextInt();
	
	System.out.print("Enter the Marks of Maths: ");
	int MathMarks = sc.nextInt();
	
	int totalGainMarks = (physicsMarks+chemistryMarks+MathMarks);
	
	float percentage = totalGainMarks/3;
	
	if(percentage>=80) {
		System.out.println("Average marks: "+percentage+"\nGrade: "+percentage+"%"+"\nRemark: "+"Leve4,above agency-normalized standards");
	}
	else if(percentage>=70 && percentage<=79){
		System.out.println("Average marks: "+percentage+"\nGrade: "+percentage+"%"+"\nRemark: "+"Leve3,at agency-normalized standards");
	}
	else if(percentage>=60 && percentage<=69){
		System.out.println("Average marks: "+percentage+"\nGrade: "+percentage+"%"+"\nRemark: "+"Leve2,below,but approaching agency-normalized standards");
	}
   else if(percentage>=50 && percentage<=59){
	   System.out.println("Average marks: "+percentage+"\nGrade: "+percentage+"%"+"\nRemark: "+"Leve1,well below agency-normalized standards");
	}
   else if(percentage>=40 && percentage<=49){
	   System.out.println("Average marks: "+percentage+"\nGrade: "+percentage+"%"+"\nRemark: "+"Leve1-,to below agency-normalized standards");
	}
   else if(percentage<=39){
	   System.out.println("Average marks: "+percentage+"\nGrade: "+percentage+"%"+"\nRemark: "+"Work hard you are passed");
	}
	
}
}
