package com.bridgelabz.regex;

public class LicensePlateValidator {
    public static void main(String[] args) {
        String plate = "AB1234";
        String regex = "^[A-Z]{2}[0-9]{4}$";

        System.out.println(plate.matches(regex)
                ? "Valid License Plate"
                : "Invalid License Plate");
    }
}

