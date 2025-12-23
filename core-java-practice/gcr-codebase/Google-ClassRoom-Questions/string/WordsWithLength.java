package com.string;

import java.util.Scanner;

public class WordsWithLength {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = sc.nextLine();

        String[] words = splitTextManually(text);

        String[][] wordLengthArray = getWordLengthArray(words);

        System.out.println("\nWord\t\tLength");

        for (int i = 0; i < wordLengthArray.length; i++) {
            String word = wordLengthArray[i][0];
            int length = Integer.parseInt(wordLengthArray[i][1]);
            System.out.println(word + "\t\t" + length);
        }

        sc.close();
    }
}

