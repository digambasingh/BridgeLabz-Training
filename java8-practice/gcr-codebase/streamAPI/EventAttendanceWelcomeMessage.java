package com.bridgelabz.streamAPI;

import java.util.Arrays;
import java.util.List;

public class EventAttendanceWelcomeMessage {
	public static void main(String[] args) {
		List<String> attendees = Arrays.asList("Amit", "Neha", "Ravi");

		attendees.forEach(a -> System.out.println("Welcome " + a));

	}
}
