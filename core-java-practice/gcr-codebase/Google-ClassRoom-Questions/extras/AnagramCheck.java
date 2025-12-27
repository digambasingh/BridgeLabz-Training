package com.bridgelabz.extras;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        int[] count = new int[256];
        for (char ch : s1.toCharArray())
            count[ch]++;
        for (char ch : s2.toCharArray())
            count[ch]--;

        for (int i : count) {
            if (i != 0) {
                System.out.println("Not Anagrams");
                return;
            }
        }
        System.out.println("Anagrams");
    }
}
