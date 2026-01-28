package com.exceptionhandling;

//Problem Statement:
//Write a Java program that reads the first line of a file named "info.txt" using BufferedReader.
//Use try-with-resources to ensure the file is automatically closed after reading.
//Handle any IOException that may occur.
//Expected Behavior:
//If the file exists, print its first line.
//If the file does not exist, catch IOException and print "Error reading file".


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class TryWithResources {
	public static void main(String[] args) throws IOException {
		
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\chand\\Downloads\\spring-jar-files\\BridgelabzExceptionHandling\\src\\com\\exceptionhandling\\data.txt"));) {
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch(IOException e) {
			System.out.println("FileNotFoundException");
		}
	}
}
