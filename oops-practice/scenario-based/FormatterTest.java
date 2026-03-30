package com.scenario;

class SentenceFormatter {

    public static String formatParagraph(String paragraph) {

        if (paragraph == null || paragraph.trim().isEmpty()) {
            return "";
        }

        // Trim extra spaces
        paragraph = paragraph.trim();

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < paragraph.length(); i++) {
            char ch = paragraph.charAt(i);

            // Capitalize first letter of sentence
            if (capitalizeNext && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(ch);
            }

            // After punctuation, ensure one space and capitalize next letter
            if (ch == '.' || ch == '?' || ch == '!') {
                capitalizeNext = true;

                // Skip extra spaces after punctuation
                while (i + 1 < paragraph.length() && paragraph.charAt(i + 1) == ' ') {
                    i++;
                }

                // Add exactly one space if not end of string
                if (i + 1 < paragraph.length()) {
                    result.append(" ");
                }
            }
        }

        return result.toString();
    }
}


public class FormatterTest {
    public static void main(String[] args) {

        String input = "   hello world.this is a test!   how are you?i am fine. ";
        String output = SentenceFormatter.formatParagraph(input);

        System.out.println(output);
    }
}

