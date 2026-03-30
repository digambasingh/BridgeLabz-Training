package com.bridgelabz.methods;

import java.util.Scanner;

//Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it
//Hint => 
//Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
//Write a Method to find the youngest of the 3 friends
//Write a Method to find the tallest of the 3 friends

public class FriendsComparison {

    public static int findYoungest(int[] ages) {
        int min = ages[0];
        for (int age : ages)
            min = Math.min(min, age);
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights)
            max = Math.max(max, h);
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age: ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height: ");
            heights[i] = sc.nextInt();
        }

        System.out.println("Youngest Age: " + findYoungest(ages));
        System.out.println("Tallest Height: " + findTallest(heights));
    }
}
