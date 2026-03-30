package com.bridgelabz.ioProgramming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateCSV {

    public static void main(String[] args) {

        String inputFile = "C:\\\\Users\\\\chand\\\\Downloads\\\\spring-jar-files\\\\Bridgelabz.io-programming\\\\src\\\\com\\\\bridgelabz\\\\ioProgramming\\\\employees.csv";
        String outputFile = "employees_updated.csv";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter(outputFile)
        ) {

            String line;

            // Read and write header
            line = br.readLine();
            writer.append(line).append("\n");

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                // Increase salary by 10% for IT department
                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10);
                }

                // Write updated record
                writer.append(id + "," + name + "," + department + "," + salary + "\n");
            }

            System.out.println("CSV file updated successfully!");

        } catch (IOException e) {
            System.out.println("Error processing the CSV file");
            e.printStackTrace();
        }
    }
}

