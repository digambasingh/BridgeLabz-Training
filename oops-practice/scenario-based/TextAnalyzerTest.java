package com.scenario;

class TextAnalyzer {

    // Count number of words
    public static int countWords(String paragraph) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            return 0;
        }

        String[] words = paragraph.trim().split("\\s+");
        return words.length;
    }

    // Find longest word
    public static String findLongestWord(String paragraph) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            return "";
        }

        String[] words = paragraph.trim().split("\\s+");
        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    // Replace word (case-insensitive)
    public static String replaceWord(String paragraph, String oldWord, String newWord) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            return "";
        }

        return paragraph.replaceAll("(?i)\\b" + oldWord + "\\b", newWord);
    }
}


public class TextAnalyzerTest {
    public static void main(String[] args) {

        String paragraph = "Java is powerful. Java is popular and Java is versatile.";

        System.out.println("Word Count: " + TextAnalyzer.countWords(paragraph));
        System.out.println("Longest Word: " + TextAnalyzer.findLongestWord(paragraph));

        String replaced = TextAnalyzer.replaceWord(paragraph, "java", "Python");
        System.out.println("After Replacement: " + replaced);
    }
}

