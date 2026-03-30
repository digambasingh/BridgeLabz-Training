package com.string;
import java.util.Scanner;

//Write a program to split the text into words and find the shortest and longest strings in a given text
//Hint => 
//Take user input using the Scanner nextLine() method 
//Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
//Create a method to find and return a string's length without using the length() method. 
//Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
//Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
//The main function calls the user-defined methods and displays the result


public class ShortestAndLongestWord {

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

    public static String[] splitTextManually(String text) {
        int length = findLength(text);
        int wordCount = 0;

        for (int i = 0; i < length; i++) {
            if ((i == 0 && text.charAt(i) != ' ') ||
                (text.charAt(i) != ' ' && text.charAt(i - 1) == ' ')) {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if ((i == 0 && text.charAt(i) != ' ') ||
                (text.charAt(i) != ' ' && text.charAt(i - 1) == ' ')) {

                String word = "";
                int j = i;

                while (j < length && text.charAt(j) != ' ') {
                    word += text.charAt(j);
                    j++;
                }

                words[index++] = word;
                i = j;
            }
        }
        return words;
    }

    public static String[][] getWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);
        }
        return result;
    }

    public static int[] findShortestAndLongest(String[][] wordLengthArray) {
        int shortestIndex = 0;
        int longestIndex = 0;

        int minLength = Integer.parseInt(wordLengthArray[0][1]);
        int maxLength = Integer.parseInt(wordLengthArray[0][1]);

        for (int i = 1; i < wordLengthArray.length; i++) {
            int currentLength = Integer.parseInt(wordLengthArray[i][1]);

            if (currentLength < minLength) {
                minLength = currentLength;
                shortestIndex = i;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestIndex = i;
            }
        }

        return new int[] { shortestIndex, longestIndex };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = sc.nextLine();

        String[] words = splitTextManually(text);
        String[][] wordLengthArray = getWordLengthArray(words);
        int[] indexes = findShortestAndLongest(wordLengthArray);

        System.out.println("\nShortest Word: " +
                wordLengthArray[indexes[0]][0] +
                " (Length: " + wordLengthArray[indexes[0]][1] + ")");

        System.out.println("Longest Word: " +
                wordLengthArray[indexes[1]][0] +
                " (Length: " + wordLengthArray[indexes[1]][1] + ")");

        sc.close();
    }
}
