package com.bridgelabz.regex;

public class IPAddressValidator {
    public static void main(String[] args) {

        String ip = "192.168.1.1";

        String regex =
            "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}" +
            "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";

        if (ip.matches(regex)) {
            System.out.println("Valid IPv4 Address");
        } else {
            System.out.println("Invalid IPv4 Address");
        }
    }
}

