package com.bridgelabz.methods;

//Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().
//Hint => 
//Write a method that generates array of 4 digit random numbers given the size as a parameter as shown in the method signature 
//public int[] generate4DigitRandomArray(int size)
//Write a method to find average, min and max value of an array 
//public double[] findAverageMinMax(int[] numbers)

public class RandomNumberStatus {

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = 1000 + (int)(Math.random() * 9000);
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;

        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        return new double[]{(double)sum / numbers.length, min, max};
    }

    public static void main(String[] args) {
        int[] nums = generate4DigitRandomArray(5);
        double[] result = findAverageMinMax(nums);

        System.out.println("Average: " + result[0]);
        System.out.println("Min: " + result[1]);
        System.out.println("Max: " + result[2]);
    }
}
