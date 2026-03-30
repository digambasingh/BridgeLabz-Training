package com.bridgelabz.methods;

//Write a program to take 2 numbers and print their quotient and reminder
//Hint => 
//Take user input as integer
//Use division operator (/) for quotient and moduli operator (%) for reminder
//Write Method to find the reminder and the quotient of a number 

import java.util.Scanner;

public class QuotientRemainder {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number / divisor, number % divisor};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number and divisor: ");
        int number = sc.nextInt();
        int divisor = sc.nextInt();

        int[] result = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

        sc.close();
    }
}

