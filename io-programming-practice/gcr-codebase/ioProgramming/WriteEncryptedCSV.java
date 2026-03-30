package com.bridgelabz.ioProgramming;

import java.io.FileWriter;

public class WriteEncryptedCSV {

    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("C:\\\\Users\\\\chand\\\\Downloads\\\\spring-jar-files\\\\Bridgelabz.io-programming\\\\src\\\\com\\\\bridgelabz\\\\ioProgramming\\\\employees_secure.csv")) {

            writer.append("ID,Name,Email,Salary\n");

            writer.append("101,Digambar,"
                    + CryptoUtil.encrypt("digambar@gmail.com") + ","
                    + CryptoUtil.encrypt("45000") + "\n");

            writer.append("102,Amit,"
                    + CryptoUtil.encrypt("amit@yahoo.com") + ","
                    + CryptoUtil.encrypt("38000") + "\n");

            System.out.println(" Encrypted CSV file written successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
