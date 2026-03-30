package com.bridge.lab.day2;

public class DiscountCharge {

	public static void main(String[] args) {
		// University charging the fee of INR 125000 for the course . the University is willing to offer a discount of 10%. write a program to find the discount amount and discount price the student will pay for the course
		int universityFee = 125000;
		double discount = (double)10/100;
		double discountAmount = discount*universityFee;
		double payFee = universityFee-discountAmount;
		System.out.println("The discount Amount in INR : "+discountAmount+" and final discount fee in INR: "+payFee);
	}

}
