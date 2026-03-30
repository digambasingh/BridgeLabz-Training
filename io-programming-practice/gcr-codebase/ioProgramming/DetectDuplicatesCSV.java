package com.bridgelabz.ioProgramming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicatesCSV {

    public static void main(String[] args) {

        String filePath = "C:\\\\Users\\\\chand\\\\Downloads\\\\spring-jar-files\\\\Bridgelabz.io-programming\\\\src\\\\com\\\\bridgelabz\\\\ioProgramming\\\\records.csv";
        Set<String> seenIds = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Skip header
            br.readLine();

            String line;
            boolean foundDuplicate = false;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");
                String id = data[0];

                if (!seenIds.add(id)) {
                    System.out.println("Duplicate Record Found -> " + line);
                    foundDuplicate = true;
                }
            }

            if (!foundDuplicate) {
                System.out.println("No duplicate records found.");
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
            e.printStackTrace();
        }
    }
}

