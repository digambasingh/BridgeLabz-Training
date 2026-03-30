package com.bridgelabz.lexicalTwist;

import java.util.*;

public class LexicalTwist {

    private static boolean isValidWord(String word) {
        return !word.contains(" ");
    }

    private static boolean isVowel(char ch) {
        return "AEIOU".indexOf(ch) != -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word");
        String first = sc.nextLine();

        if (!isValidWord(first)) {
            System.out.println(first + " is an invalid word");
            return;
        }

        System.out.println("Enter the second word");
        String second = sc.nextLine();

        if (!isValidWord(second)) {
            System.out.println(second + " is an invalid word");
            return;
        }

        String reversedFirst =
                new StringBuilder(first).reverse().toString();

        if (reversedFirst.equalsIgnoreCase(second)) {

            String result = reversedFirst.toLowerCase()
                    .replaceAll("[aeiou]", "@");

            System.out.println(result);

        } else {

            String combined = (first + second).toUpperCase();

            int vowelCount = 0, consonantCount = 0;

            for (char ch : combined.toCharArray()) {
                if (isVowel(ch)) {
                    vowelCount++;
                } else if (Character.isLetter(ch)) {
                    consonantCount++;
                }
            }

            if (vowelCount > consonantCount) {
                printFirstTwoDistinct(combined, true);
            } else if (consonantCount > vowelCount) {
                printFirstTwoDistinct(combined, false);
            } else {
                System.out.println("Vowels and consonants are equal");
            }
        }

        sc.close();
    }

    private static void printFirstTwoDistinct(String word, boolean vowels) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char ch : word.toCharArray()) {
            if (vowels && isVowel(ch)) {
                set.add(ch);
            } else if (!vowels && Character.isLetter(ch) && !isVowel(ch)) {
                set.add(ch);
            }

            if (set.size() == 2)
                break;
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : set) {
            sb.append(ch);
        }

        System.out.println(sb.toString());
    }
}

