package com.string;
import java.util.Scanner;

public class SplitTextComparison {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // string end
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

        
        int[] indexes = new int[wordCount];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if ((i == 0 && text.charAt(i) != ' ') || (text.charAt(i) != ' ' && text.charAt(i - 1) == ' ')) {
                indexes[index++] = i;
            }
        }
    
        String[] words = new String[wordCount];

        for (int i = 0; i < wordCount; i++) {
            int start = indexes[i];
            int end = start;

            while (end < length && text.charAt(end) != ' ') {
                end++;
            }

            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }
    
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter the text:");
        String text = sc.nextLine();

        String[] manualSplit = splitTextManually(text);
        
        String[] builtInSplit = text.split(" ");
       
        boolean result = compareStringArrays(manualSplit, builtInSplit);
        
        System.out.println("\nWords using manual split:");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nAre both split results equal? " + result);

        sc.close();
    }
}

