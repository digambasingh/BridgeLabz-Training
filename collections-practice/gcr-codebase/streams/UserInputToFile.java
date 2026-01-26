package com.streams;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputToFile {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = null;

        try {
            // Read input from console
            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String age = br.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            // Write data to file
            writer = new FileWriter("user_details.txt");

            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + language + "\n");

            System.out.println("User information saved successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while reading input or writing to file.");
        } finally {
            try {
                if (writer != null)
                    writer.close();
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error while closing resources.");
            }
        }
    }
}

