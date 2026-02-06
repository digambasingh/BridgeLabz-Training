package com.bridgelabz.streamAPI;

import java.util.Arrays;
import java.util.List;

public class EmailNotification {
	public static void main(String[] args) {
		List<String> emails = Arrays.asList("digambar14062004@gmail.com", "digambar.singh_cs22@gla.ac.in");

		emails.forEach(email -> sendEmailNotification(email));

	}
	static void sendEmailNotification(String email) {
	    System.out.println("Email sent to " + email);
	}
}
