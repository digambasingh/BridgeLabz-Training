package com.bridgelabz.streamAPI;

import java.util.Arrays;
import java.util.List;

public class StockPriceLogger {
	public static void main(String[] args) {
		List<Double> prices = Arrays.asList(101.5, 102.3, 99.8);

		prices.forEach(p -> System.out.println("Stock price: " + p));

	}
}
