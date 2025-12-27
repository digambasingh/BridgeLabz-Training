package com.bridgelabz.extras;

public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Java programming language";
        String[] words = sentence.split(" ");
        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }
        System.out.println("Longest Word: " + longest);
    }
}
