package com.bridgelabz.ioProgramming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MergeCSVFiles {

    public static void main(String[] args) {

        String file1 = "C:\\\\Users\\\\chand\\\\Downloads\\\\spring-jar-files\\\\Bridgelabz.io-programming\\\\src\\\\com\\\\bridgelabz\\\\ioProgramming\\\\students1.csv";
        String file2 = "C:\\\\Users\\\\chand\\\\Downloads\\\\spring-jar-files\\\\Bridgelabz.io-programming\\\\src\\\\com\\\\bridgelabz\\\\ioProgramming\\\\students2.csv";
        String outputFile = "C:\\\\Users\\\\chand\\\\Downloads\\\\spring-jar-files\\\\Bridgelabz.io-programming\\\\src\\\\com\\\\bridgelabz\\\\ioProgramming\\\\students_merged.csv";

        // Map to store data from students2.csv
        Map<String, String[]> marksMap = new HashMap<>();

        try (
            BufferedReader br2 = new BufferedReader(new FileReader(file2));
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            FileWriter writer = new FileWriter(outputFile)
        ) {

            // Skip header of students2.csv
            br2.readLine();
            String line;

            // Read students2.csv into map
            while ((line = br2.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];
                marksMap.put(id, new String[]{data[1], data[2]});
            }

            // Write header to output file
            writer.append("ID,Name,Age,Marks,Grade\n");

            // Skip header of students1.csv
            br1.readLine();

            // Read students1.csv and merge
            while ((line = br1.readLine()) != null) {
                String[] data1 = line.split(",");
                String id = data1[0];
                String name = data1[1];
                String age = data1[2];

                if (marksMap.containsKey(id)) {
                    String[] data2 = marksMap.get(id);
                    writer.append(id + "," + name + "," + age + "," +
                                  data2[0] + "," + data2[1] + "\n");
                }
            }

            System.out.println("CSV files merged successfully!");

        } catch (IOException e) {
            System.out.println("Error while merging CSV files");
            e.printStackTrace();
        }
    }
}

