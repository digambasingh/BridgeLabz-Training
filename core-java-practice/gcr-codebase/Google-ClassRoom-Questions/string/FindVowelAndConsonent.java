package com.string;

//Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string
//Hint => 
//Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
//Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
//Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
//Create a Method to Method to find vowels and consonants in a string using charAt() method and finally return the count of vowels and consonants in an array
//Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 


import java.util.Scanner;
public class FindVowelAndConsonent {

	    public static String checkCharacter(char ch) {

	        if (ch >= 'A' && ch <= 'Z') {
	            ch = (char) (ch + 32);
	        }

	        // Check if character is a letter
	        if (ch >= 'a' && ch <= 'z') {

	            if (ch == 'a' || ch == 'e' || ch == 'i' || 
	                ch == 'o' || ch == 'u') {
	                return "Vowel";
	            } else {
	                return "Consonant";
	            }
	        }

	        return "Not a Letter";
	    }

	    public static int[] findVowelsAndConsonants(String text) {
	        int vowels = 0;
	        int consonants = 0;

	        for (int i = 0; i < text.length(); i++) {
	            char ch = text.charAt(i);
	            String result = checkCharacter(ch);

	            if (result.equals("Vowel")) {
	                vowels++;
	            } else if (result.equals("Consonant")) {
	                consonants++;
	            }
	        }

	        return new int[] { vowels, consonants };
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a string:");
	        String input = sc.nextLine();

	        int[] counts = findVowelsAndConsonants(input);

	        System.out.println("\nNumber of Vowels: " + counts[0]);
	        System.out.println("Number of Consonants: " + counts[1]);

	        sc.close();
	    }
	}


