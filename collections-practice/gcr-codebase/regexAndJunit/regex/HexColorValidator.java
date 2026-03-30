package com.bridgelabz.regex;

public class HexColorValidator {
    public static void main(String[] args) {
        String color = "#FFA500";
        String regex = "^#[0-9A-Fa-f]{6}$";

        System.out.println(color.matches(regex)
                ? "Valid Hex Color"
                : "Invalid Hex Color");
    }
}

