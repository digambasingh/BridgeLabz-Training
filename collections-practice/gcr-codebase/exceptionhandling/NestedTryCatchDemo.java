package com.exceptionhandling;

import java.util.Scanner;

public class NestedTryCatchDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter index to access: ");
        int index = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        try {
            int value = arr[index];

            try {
                int result = value / divisor;
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }

        sc.close();
    }
}
