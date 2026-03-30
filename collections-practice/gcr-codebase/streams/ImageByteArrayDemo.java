package com.streams;

import java.io.*;

public class ImageByteArrayDemo {

    public static void main(String[] args) {

        String sourceImage = "C:\\\\Users\\\\chand\\\\Downloads\\\\spring-jar-files\\\\BridgelabzCollections\\\\src\\\\com\\\\streams\\\\original.png";
        String outputImage = "C:\\\\Users\\\\chand\\\\Downloads\\\\spring-jar-files\\\\BridgelabzCollections\\\\src\\\\com\\\\streams\\\\copied.png";

        try {
            // Step 1: Read image into ByteArrayOutputStream
            FileInputStream fis = new FileInputStream(sourceImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();

            fis.close();
            baos.close();

            // Step 2: Write byte array back to image file
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(outputImage);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            bais.close();
            fos.close();

            System.out.println("Image successfully converted to byte array and restored.");

        } catch (IOException e) {
            System.out.println("Error occurred while processing the image.");
        }
    }
}

