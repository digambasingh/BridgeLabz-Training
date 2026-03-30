package com.string;

import java.util.Scanner;

public class UniqueCharacter {

	    public static int findLength(String text) {
	        int count = 0;
	        try {
	            while (true) {
	                text.charAt(count);
	                count++;
	            }
	        } catch (Exception e) {
	            // End of string 
	        }
	        return count;
	    }

	    public static char[] findUniqueCharacters(String text) {
	        int length = findLength(text);

	        char[] temp = new char[length];
	        int uniqueCount = 0;

	        for (int i = 0; i < length; i++) {
	            char current = text.charAt(i);
	            boolean isUnique = true;

	            for (int j = 0; j < i; j++) {
	                if (current == text.charAt(j)) {
	                    isUnique = false;
	                    break;
	                }
	            }

	            // Store character if unique
	            if (isUnique) {
	                temp[uniqueCount++] = current;
	            }
	        }

	        char[] uniqueChars = new char[uniqueCount];
	        for (int i = 0; i < uniqueCount; i++) {
	            uniqueChars[i] = temp[i];
	        }

	        return uniqueChars;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a string:");
	        String input = sc.nextLine();

	        char[] uniqueCharacters = findUniqueCharacters(input);

	        System.out.println("\nUnique characters in the string:");
	        for (char ch : uniqueCharacters) {
	            System.out.print(ch + " ");
	        }

	        sc.close();
	    }
	}

