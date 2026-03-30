package com.bridgelabz.regex;

public class CreditCardValidator {
    public static void main(String[] args) {

        String cardNumber = "4123456789012345"; // Visa
        // String cardNumber = "5123456789012345"; // MasterCard

        String visaRegex = "^4\\d{15}$";
        String masterRegex = "^5\\d{15}$";

        if (cardNumber.matches(visaRegex)) {
            System.out.println("Valid Visa Card");
        } else if (cardNumber.matches(masterRegex)) {
            System.out.println("Valid MasterCard");
        } else {
            System.out.println("Invalid Card Number");
        }
    }
}

