package com.bridgelabz.ioProgramming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\chand\\Downloads\\spring-jar-files\\Bridgelabz.io-programming\\src\\com\\bridgelabz\\ioProgramming\\Student.csv"; 
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();

            System.out.println("Student Details:\n");

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                System.out.println("ID    : " + id);
                System.out.println("Name  : " + name);
                System.out.println("Age   : " + age);
                System.out.println("Marks : " + marks);
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error reading the file");
            e.printStackTrace();
        }
    }
}

