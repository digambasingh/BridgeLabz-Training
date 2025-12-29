package com.bridgelabz.extra.builtin;

//2. Problem 2: Date Arithmetic Create a program that:
//➢ Takes a date input and adds 7 days, 1 month, and 2 years to it.
//➢ Then subtracts 3 weeks from the result.
//Hint: Use LocalDate.plusDays(), plusMonths(), plusYears(), and
//minusWeeks() methods.

import java.time.LocalDate;

public class Problem2_DateArithmetic {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2025, 1, 10); 

        LocalDate result = date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2)
                .minusWeeks(3);

        System.out.println("Original Date: " + date);
        System.out.println("Final Date: " + result);
    }
}
