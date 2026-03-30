package com.bridgelabz.JsonData;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ValidateJsonStructureUsingJacson {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.readTree(new File("C:\\Users\\chand\\Downloads\\spring-jar-files\\Bridgelabz.io-programming\\src\\com\\bridgelabz\\JsonData\\\\user.json"));
            System.out.println("Valid JSON structure.");
        } catch (Exception e) {
            System.out.println("Invalid JSON structure.");
        }
    }
}

