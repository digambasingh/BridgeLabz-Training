package com.bridgelabz.methods;

//Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results
//Hint => 
//Take the input for a number
//Write a static Method to find the factors of the number and save them in an array and return the array. 
//To find factors and save to array will have two loops. The first loop to find the count and initialize the array with the count. And the second loop save the factors into the array
//Write a method to find the sum of the factors using factors array
//Write a method to find the product of the factors using factors array
//Write a method to find the sum of square of the factors using Math.pow() method

import java.util.Scanner;

public class FactorsOfNumber {

    public static int[] findFactors(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                factors[index++] = i;
        }
        return factors;
    }

    public static int findSum(int[] factors) {
        int sum = 0;
        for (int f : factors)
            sum += f;
        return sum;
    }

    public static int findProduct(int[] factors) {
        int product = 1;
        for (int f : factors)
            product *= f;
        return product;
    }

    public static double findSumOfSquares(int[] factors) {
        double sum = 0;
        for (int f : factors)
            sum += Math.pow(f, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.println("Factors:");
        for (int f : factors)
            System.out.print(f + " ");

        System.out.println("\nSum: " + findSum(factors));
        System.out.println("Product: " + findProduct(factors));
        System.out.println("Sum of Squares: " + findSumOfSquares(factors));
    }
}

