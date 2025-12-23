package com.string;
import java.util.Scanner;

public class LowerCaseComparison {

    public static String convertToLowerCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result = result + ch;
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the complete text:");
        String inputText = sc.nextLine();

        String manualLowerCase = convertToLowerCase(inputText);

        String builtInLowerCase = inputText.toLowerCase();

        boolean result = compareStrings(manualLowerCase, builtInLowerCase);

        System.out.println("Manual Lowercase Text: " + manualLowerCase);
        System.out.println("Built-in Lowercase Text: " + builtInLowerCase);
        System.out.println("Are both lowercase strings equal? " + result);

        sc.close();
    }
}
