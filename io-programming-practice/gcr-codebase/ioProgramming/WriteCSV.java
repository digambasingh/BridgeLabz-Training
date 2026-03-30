package com.bridgelabz.ioProgramming;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {

    public static void main(String[] args) {

        String filePath = "C:\\\\Users\\\\chand\\\\Downloads\\\\spring-jar-files\\\\Bridgelabz.io-programming\\\\src\\\\com\\\\bridgelabz\\\\ioProgramming\\\\employees.csv";

        try (FileWriter writer = new FileWriter(filePath)) {

            writer.append("ID,Name,Department,Salary\n");

            // Writing employee records
            writer.append("101,Digambar,IT,45000\n");
            writer.append("102,Amit,HR,38000\n");
            writer.append("103,Rahul,Finance,52000\n");
            writer.append("104,Sneha,Marketing,40000\n");
            writer.append("105,Pooja,Operations,47000\n");

            System.out.println("CSV file created and data written successfully!");

        } catch (IOException e) {
            System.out.println("Error writing to CSV file");
            e.printStackTrace();
        }
    }
}

