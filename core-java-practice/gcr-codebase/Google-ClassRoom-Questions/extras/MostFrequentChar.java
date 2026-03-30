package com.bridgelabz.extras;

public class MostFrequentChar {
    public static void main(String[] args) {
        String str = "success";
        int[] freq = new int[256];

        for (char ch : str.toCharArray())
            freq[ch]++;

        char maxChar = str.charAt(0);
        for (char ch : str.toCharArray()) {
            if (freq[ch] > freq[maxChar])
                maxChar = ch;
        }
        System.out.println("Most Frequent Character: '" + maxChar + "'");
    }
}

