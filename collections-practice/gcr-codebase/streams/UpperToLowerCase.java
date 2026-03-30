package com.streams;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class UpperToLowerCase {

    public static void main(String[] args) {

        String sourceFile = "C:\\\\Users\\\\chand\\\\Downloads\\\\spring-jar-files\\\\BridgelabzCollections\\\\src\\\\com\\\\streams\\\\input.txt";
        String destinationFile = "C:\\\\Users\\\\chand\\\\Downloads\\\\spring-jar-files\\\\BridgelabzCollections\\\\src\\\\com\\\\streams\\\\output.txt";

        try (
            // Reader with encoding handling
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(sourceFile),
                            StandardCharsets.UTF_8
                    )
            );

            // Writer with encoding handling
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(destinationFile),
                            StandardCharsets.UTF_8
                    )
            )
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }

            System.out.println("File converted to lowercase successfully.");

        } catch (IOException e) {
            System.out.println("Error while reading or writing the file.");
        }
    }
}
