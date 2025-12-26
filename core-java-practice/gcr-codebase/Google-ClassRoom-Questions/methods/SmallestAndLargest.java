package com.bridgelabz.methods;

//Write a program to find the smallest and the largest of the 3 numbers.
//Hint => 
//Take user input for 3 numbers
//Write a single method to find the smallest and largest of the three numbers
//public static int[] findSmallestAndLargest(int number1, int number2, int number3)

import java.util.Scanner;

public class SmallestAndLargest {

    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {
        int smallest = Math.min(n1, Math.min(n2, n3));
        int largest = Math.max(n1, Math.max(n2, n3));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] result = findSmallestAndLargest(a, b, c);

        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);

        sc.close();
    }
}

