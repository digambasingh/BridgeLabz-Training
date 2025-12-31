package com.bridgelabz.classandobject;

class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String clean = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }

    void display() {
        if (isPalindrome())
            System.out.println(text + " is palindrome");
        else
            System.out.println(text + " is not Palindrome");
    }

    public static void main(String[] args) {
        new PalindromeChecker("A man a plan a canal Panama").display();
        new PalindromeChecker("Hello").display();
    }
}

