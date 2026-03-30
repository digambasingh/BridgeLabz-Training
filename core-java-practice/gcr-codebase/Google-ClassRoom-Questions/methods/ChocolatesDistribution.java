package com.bridgelabz.methods;

//Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
//Hint => 
//Get an integer value from user for the numberOfchocolates and numberOfChildren.
//Write the method to find the number of chocolates each child gets and number of remaining chocolates

import java.util.Scanner;

public class ChocolatesDistribution {

    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);

        System.out.println("Each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);

        sc.close();
    }
}

