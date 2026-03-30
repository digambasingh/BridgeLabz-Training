package com.bridgelabz.streamAPI;

import java.util.Arrays;
import java.util.List;

public class IOTSencerReading {
	public static void main(String[] args) {
		List<Integer> readings = Arrays.asList(25, 60, 80, 40);

		readings.stream()
		        .filter(r -> r > 50)
		        .forEach(System.out::println);

	}
}
