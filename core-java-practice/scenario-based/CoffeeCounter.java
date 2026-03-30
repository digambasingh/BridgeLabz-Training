package com.scenerio;

import java.util.Scanner;

public class CoffeeCounter {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	final double GST_RATE = 0.05;
	while(true) {
		System.out.println("Enter the coffee types: Expresso,Latte,cappuccion,Americano or exit: ");
		String coffeeType = sc.next();
		
		if(coffeeType.equalsIgnoreCase("exit")) {
			System.out.println("ThankYou cafe are close!");
			break;
		}
		
		System.out.println("Enter the quantity: ");
		int quantity = sc.nextInt();
		
		int price = 0;
		
		switch(coffeeType) {
		case "expresso":{
			price = 350;
			break;
		}
		case "latte":{
			price = 350;
			break;
		}
		case "cappuccion":{
			price = 350;
			break;
		}
		case "Americano":{
			price = 350;
			break;
		}
		default:{
			System.out.println("Invalid Coffee Type");
			continue;
		}
		}
		double total = price*quantity;
		double gst = total*GST_RATE;
		double finalBill = total+gst;
		System.out.println("Base Amount: "+total);
		System.out.println("GST: "+gst);
		System.out.println("Total Bill: "+finalBill);
		
	}
}
	
	
}

