package com.bridgelabz.ioProgramming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\chand\\Downloads\\spring-jar-files\\Bridgelabz.io-programming\\src\\com\\bridgelabz\\ioProgramming\\Student.csv";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            br.readLine();

            while (br.readLine() != null) {
                count++;
            }

            System.out.println("Total number of records (excluding header): " + count);

        } catch (IOException e) {
            System.out.println("Error reading the CSV file");
            e.printStackTrace();
        }
    }
}

