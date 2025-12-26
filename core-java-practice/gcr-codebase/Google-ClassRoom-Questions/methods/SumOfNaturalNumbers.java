package com.bridgelabz.methods;

//Write a program to find the sum of n natural numbers using loop
//Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop 

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static int sum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Sum of natural numbers: " + sum(n));

        sc.close();
    }
}

