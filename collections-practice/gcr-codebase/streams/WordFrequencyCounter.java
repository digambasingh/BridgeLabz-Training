package com.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String filePath = "C:\\\\Users\\\\chand\\\\Downloads\\\\spring-jar-files\\\\BridgelabzCollections\\\\src\\\\com\\\\streams\\\\input.txt";
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Step 1: Read file and count words
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                // Convert to lowercase and remove punctuation
                String[] words = line.toLowerCase()
                        .replaceAll("[^a-z0-9 ]", "")
                        .split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error while reading the file.");
            return;
        }

        // Step 2: Sort words by frequency
        List<Map.Entry<String, Integer>> wordList =
                new ArrayList<>(wordCount.entrySet());

        wordList.sort((a, b) -> b.getValue() - a.getValue());

        // Step 3: Display top 5 words
        System.out.println("Top 5 most frequent words:");

        int limit = Math.min(5, wordList.size());
        for (int i = 0; i < limit; i++) {
            Map.Entry<String, Integer> entry = wordList.get(i);
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

