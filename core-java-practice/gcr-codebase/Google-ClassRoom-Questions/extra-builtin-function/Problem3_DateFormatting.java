package com.bridgelabz.extra.builtin;

//Problem 3: Date Formatting Write a program that:
//➢ Displays the current date in three different formats:
//■ dd/MM/yyyy
//■ yyyy-MM-dd
//■ EEE, MMM dd, yyyy
//
//Hint: Use DateTimeFormatter with custom patterns for date formatting.

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Problem3_DateFormatting {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Formatted Dates:");
        System.out.println(today.format(f1));
        System.out.println(today.format(f2));
        System.out.println(today.format(f3));
    }
}

