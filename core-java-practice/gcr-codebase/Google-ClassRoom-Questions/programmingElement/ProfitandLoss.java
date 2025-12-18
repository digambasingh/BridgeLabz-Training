package com.bridge.lab.day2;

public class ProfitandLoss {

	public static void main(String[] args) {
		// find the profit and loss in numbers
		double cp = 129;
		double sp = 191;
		double profit = sp-cp;
		double profitInPer = (sp/cp)*100;
		System.out.println("Profit in Number: "+profit);
		System.out.println("Profit in Percentage: "+profitInPer+" %");
	}

}
