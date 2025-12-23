package com.string;

import java.util.Scanner;

public class CharacterFrequency {

    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();      // Store characters
        int[] freq = new int[chars.length];     // Store frequency

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                continue;
            }
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark duplicate
                }
            }
        }

        String[] result = new String[chars.length];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + freq[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] frequencyResult = findFrequency(input);

        System.out.println("\nCharacter Frequencies:");
        for (String s : frequencyResult) {
            if (s != null) {
                System.out.println(s);
            }
        }

        sc.close();
    }
}
