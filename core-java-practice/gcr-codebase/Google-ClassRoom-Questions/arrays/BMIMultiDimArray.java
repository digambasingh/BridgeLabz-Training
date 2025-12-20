package com.Arrays;

import java.util.Scanner;

public class BMIMultiDimArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        
        for (int i = 0; i < number; i++) {

            System.out.println("\nPerson " + (i + 1));

          
            do {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = sc.nextDouble();
            } while (personData[i][0] <= 0);

            
            do {
                System.out.print("Enter height (meters): ");
                personData[i][1] = sc.nextDouble();
            } while (personData[i][1] <= 0);
        }

        
        for (int i = 0; i < number; i++) {

            double weight = personData[i][0];
            double height = personData[i][1];

            personData[i][2] = weight / (height * height);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        
        System.out.println("\nBMI Report:");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " m");
            System.out.println("BMI: " + String.format("%.2f", personData[i][2]));
            System.out.println("Status: " + weightStatus[i]);
            System.out.println();
        }

        sc.close();
    }
}
