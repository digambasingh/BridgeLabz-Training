package com.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


//Create a Java program that reads a file named "data.txt". If the file does not exist, handle the IOException properly and display a user-friendly message.
//Expected Behavior:
//If the file exists, print its contents.
//If the file does not exist, catch the IOException and print "File not found".

public class CheckIOEcception {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\chand\\Downloads\\spring-jar-files\\BridgelabzExceptionHandling\\src\\com\\exceptionhandling\\data.txt"));
			String line;
			while( (line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			br.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
