package com.bridgelabz.extra.builtin;

//Problem 4: Date Comparison Write a program that:
//➢ Takes two date inputs and compares them to check if the first date is before, after,
//or the same as the second date.
//Hint: Use isBefore(), isAfter(), and isEqual() methods from the LocalDate class

import java.time.LocalDate;

public class Problem4_DateComparison {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2025, 3, 15);
        LocalDate date2 = LocalDate.of(2025, 6, 20);

        if (date1.isBefore(date2)) {
            System.out.println("Date1 is before Date2");
        } else if (date1.isAfter(date2)) {
            System.out.println("Date1 is after Date2");
        } else if (date1.isEqual(date2)) {
            System.out.println("Date1 is equal to Date2");
        }
    }
}

