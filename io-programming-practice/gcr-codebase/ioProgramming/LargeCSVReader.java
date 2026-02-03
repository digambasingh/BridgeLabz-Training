package com.bridgelabz.ioProgramming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LargeCSVReader {

    private static final int CHUNK_SIZE = 100;

    public static void main(String[] args) {

        String filePath = "C:\\\\Users\\\\chand\\\\Downloads\\\\spring-jar-files\\\\Bridgelabz.io-programming\\\\src\\\\com\\\\bridgelabz\\\\ioProgramming\\\\large_file.csv";
        int totalProcessed = 0;

        List<String> buffer = new ArrayList<>(CHUNK_SIZE);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath), 64 * 1024)) {
            // 64KB buffer improves IO performance

            // Skip header if present
            String line = br.readLine();

            while ((line = br.readLine()) != null) {

                buffer.add(line);

                if (buffer.size() == CHUNK_SIZE) {
                    totalProcessed += processChunk(buffer);
                    buffer.clear(); // Free memory immediately

                    System.out.println("Records processed so far: " + totalProcessed);
                }
            }

            // Process remaining lines 
            if (!buffer.isEmpty()) {
                totalProcessed += processChunk(buffer);
                buffer.clear();
                System.out.println("Records processed so far: " + totalProcessed);
            }

            System.out.println("\nFinished processing file.");
            System.out.println("Total records processed: " + totalProcessed);

        } catch (IOException e) {
            System.out.println("Error reading large CSV file");
            e.printStackTrace();
        }
    }

    // Process only 100 records at a time
    private static int processChunk(List<String> chunk) {

        for (String record : chunk) {
            //  insert into DB
            // record.split(",");
        }

        return chunk.size();
    }
}

