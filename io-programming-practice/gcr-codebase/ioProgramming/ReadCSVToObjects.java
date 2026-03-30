package com.bridgelabz.ioProgramming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSVToObjects {

    public static void main(String[] args) {

        String filePath = "C:\\\\Users\\\\chand\\\\Downloads\\\\spring-jar-files\\\\Bridgelabz.io-programming\\\\src\\\\com\\\\bridgelabz\\\\ioProgramming\\\\student.csv";

        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Skip header
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                students.add(new Student(id, name, age, marks));
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
            e.printStackTrace();
        }

        // Print Student objects
        System.out.println("Student Objects:\n");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
