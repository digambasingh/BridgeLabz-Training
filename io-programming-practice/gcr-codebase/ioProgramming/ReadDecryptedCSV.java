package com.bridgelabz.ioProgramming;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadDecryptedCSV {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(
                new FileReader("C:\\\\Users\\\\chand\\\\Downloads\\\\spring-jar-files\\\\Bridgelabz.io-programming\\\\src\\\\com\\\\bridgelabz\\\\ioProgramming\\\\employees_secure.csv"))) {

            // Skip header
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String id = data[0];
                String name = data[1];
                String email = CryptoUtil.decrypt(data[2]);
                String salary = CryptoUtil.decrypt(data[3]);

                System.out.println("ID     : " + id);
                System.out.println("Name   : " + name);
                System.out.println("Email  : " + email);
                System.out.println("Salary : " + salary);
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

