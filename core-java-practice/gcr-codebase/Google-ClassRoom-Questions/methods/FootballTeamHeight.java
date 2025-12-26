package com.bridgelabz.methods;

//Create a program to find the shortest, tallest, and mean height of players present in a football team.
//Hint => 
//The formula to calculate the mean is: mean = sum of all elements/number of elements
//Create an int array named heights of size 11 and get 3 digits random height in cms for each player in the range 150 cms to 250 cms
//Write the method to Find the sum of all the elements present in the array.
//Write the method to find the mean height of the players on the football team
//Write the method to find the shortest height of the players on the football team 
//Write the method to find the tallest height of the players on the football team
//Finally display the results

public class FootballTeamHeight {

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) sum += h;
        return sum;
    }

    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) min = Math.min(min, h);
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) max = Math.max(max, h);
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int)(Math.random() * 101); // 150–250
            System.out.println("Player " + (i+1) + " Height: " + heights[i]);
        }

        System.out.println("\nShortest: " + findShortest(heights));
        System.out.println("Tallest: " + findTallest(heights));
        System.out.println("Mean Height: " + findMean(heights));
    }
}

