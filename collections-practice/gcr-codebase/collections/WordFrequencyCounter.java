package com.collections;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        String text = "Hello world, hello Java!";

        // Convert to lowercase and remove punctuation
        text = text.toLowerCase().replaceAll("[^a-z ]", "");

        String[] words = text.split("\\s+");
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(frequencyMap);
    }
}
