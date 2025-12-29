package com.bridgelabz.extra.scenerio;

import java.util.Random;

//Number Guessing Game:
//○ Write a Java program where the user thinks of a number between 1 and 100, and
//the computer tries to guess the number by generating random guesses.
//○ The user provides feedback by indicating whether the guess is high, low, or
//correct. The program should be modular, with different functions for generating
//guesses, receiving user feedback, and determining the next guess.

import java.util.Scanner;

public class NumberGuessingGame {

	public static int generateGuess(int low, int high) {
		return new Random().nextInt(high-low+1)+low;
	}
	
	static String getfeedback(Scanner sc) {
		System.out.println("Enter the feedback (low/ high/ correct)");
		return sc.nextLine();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int low = 1, high = 100;
		String feedback;
		
		System.out.println("Think of a number between 1 and 100");
		while(true) {
			int guess = generateGuess(low, high);
			System.out.println("Computer guess: "+guess);
			
			feedback = getfeedback(sc);
			if(feedback.equalsIgnoreCase("correct")) {
				System.out.println("Computer generate a guess correctly!");
				break;
			}
			
			else if(feedback.equalsIgnoreCase("high")) {
			       low = low+1;
				
			}
			else if(feedback.equalsIgnoreCase("low")) {
				high = high-1;
			
			}
		}
		
	}
}
