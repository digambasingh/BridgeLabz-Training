package com.streams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {

        String sourceFile = "C:\\Users\\chand\\Downloads\\spring-jar-files\\BridgelabzCollections\\src\\com\\streams\\source.txt";
        String destinationFile = "C:\\Users\\chand\\Downloads\\spring-jar-files\\BridgelabzCollections\\src\\com\\streams\\destination.txt";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(sourceFile);   // Reads source file
            fos = new FileOutputStream(destinationFile); // Creates destination file if not exists

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Source file does not exist or an error occurred.");
        } finally {
            try {
                if (fis != null)
                    fis.close();
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                System.out.println("Error while closing files.");
            }
        }
    }
}
