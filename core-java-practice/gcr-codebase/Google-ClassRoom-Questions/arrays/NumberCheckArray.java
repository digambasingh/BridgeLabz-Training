package com.Arrays;

import java.util.Scanner;

public class NumberCheckArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        int[] arr = new int[5];

       
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        
        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        // Step 4: Compare first and last elements
        System.out.println("\nComparison of First and Last Element:");
        if (arr[0] == arr[arr.length - 1]) {
            System.out.println("First and Last elements are Equal");
        } else if (arr[0] > arr[arr.length - 1]) {
            System.out.println("First element is Greater than Last element");
        } else {
            System.out.println("First element is Less than Last element");
        }

        sc.close();
    }
}

