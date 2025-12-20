package com.Arrays;

import java.util.Scanner;

public class ArrayStoreAndSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        double[] arr = new double[10];

        double total = 0.0;
        int index = 0;

        
        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            // Break if number is 0 or negative
            if (num <= 0) {
                break;
            }

            // Break if array limit reached
            if (index == 10) {
                break;
            }

            // Store number and increment index
            arr[index] = num;
            index++;
        }

        // Display numbers and calculate sum
        System.out.println("\nStored Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
            total += arr[i];
        }

        
        System.out.println("\nSum of all numbers: " + total);

        sc.close();
    }
}

