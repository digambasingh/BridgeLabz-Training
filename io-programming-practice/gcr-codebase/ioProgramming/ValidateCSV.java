package com.bridgelabz.ioProgramming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSV {

    // Email regex pattern
    private static final String EMAIL_REGEX =
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    // Phone number regex (exactly 10 digits)
    private static final String PHONE_REGEX = "^[0-9]{10}$";

    public static void main(String[] args) {

        String filePath =  "C:\\\\Users\\\\chand\\\\Downloads\\\\spring-jar-files\\\\Bridgelabz.io-programming\\\\src\\\\com\\\\bridgelabz\\\\ioProgramming\\\\users.csv";

        Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
        Pattern phonePattern = Pattern.compile(PHONE_REGEX);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Skip header
            br.readLine();

            String line;
            int rowNumber = 1;

            while ((line = br.readLine()) != null) {
                rowNumber++;

                String[] data = line.split(",");

                String email = data[2];
                String phone = data[3];

                boolean valid = true;

                if (!emailPattern.matcher(email).matches()) {
                    System.out.println("Row " + rowNumber +
                            " Invalid Email: " + email);
                    valid = false;
                }

                if (!phonePattern.matcher(phone).matches()) {
                    System.out.println("Row " + rowNumber +
                            " Invalid Phone Number: " + phone);
                    valid = false;
                }

                if (!valid) {
                    System.out.println("Invalid Record -> " + line);
                    System.out.println();
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
            e.printStackTrace();
        }
    }
}

