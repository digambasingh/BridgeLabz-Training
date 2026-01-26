package com.streams;

import java.io.*;

public class BufferedVsUnbufferedCopy {

    private static final int BUFFER_SIZE = 4096; 

    public static void main(String[] args) {

        String sourceFile = "C:\\\\Users\\\\chand\\\\Downloads\\\\spring-jar-files\\\\BridgelabzCollections\\\\src\\\\com\\\\streams\\\\largefile.dat";   // e.g. 100MB file
        String unbufferedDest = "C:\\\\Users\\\\chand\\\\Downloads\\\\spring-jar-files\\\\BridgelabzCollections\\\\src\\\\com\\\\streams\\\\copy_unbuffered.dat";
        String bufferedDest = "C:\\\\Users\\\\chand\\\\Downloads\\\\spring-jar-files\\\\BridgelabzCollections\\\\src\\\\com\\\\streams\\\\copy_buffered.dat";

        copyUsingUnbufferedStreams(sourceFile, unbufferedDest);
        copyUsingBufferedStreams(sourceFile, bufferedDest);
    }

    // Unbuffered File Copy
    private static void copyUsingUnbufferedStreams(String source, String destination) {
        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            long endTime = System.nanoTime();
            System.out.println("Unbuffered Copy Time: " + (endTime - startTime) + " ns");

        } catch (IOException e) {
            System.out.println("Error in unbuffered file copy.");
        }
    }

    // Buffered File Copy
    private static void copyUsingBufferedStreams(String source, String destination) {
        long startTime = System.nanoTime();

        try (BufferedInputStream bis =
                     new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos =
                     new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            long endTime = System.nanoTime();
            System.out.println("Buffered Copy Time: " + (endTime - startTime) + " ns");

        } catch (IOException e) {
            System.out.println("Error in buffered file copy.");
        }
    }
}
