package com.bridgelabz.methods;

//Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()
//Hint => 
//Take a, b, and c as input values to find the roots of x.
//The roots are computed using the following formulae
//delta = b2+ 4*a*c
//If delta is positive the find the two roots using formulae 
//root1 of x = (-b + delta)/(2*a) 
//root1 of x = (-b - delta)/(2*a)
//If delta is zero then there is only one root of x  
//root of x = -b/(2*a)
//If delta is negative return empty array or nothing 

import java.util.Scanner;

public class Quadratic {

    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0)
            return new double[0];

        if (delta == 0)
            return new double[]{-b / (2 * a)};

        double r1 = (-b + Math.sqrt(delta)) / (2 * a);
        double r2 = (-b - Math.sqrt(delta)) / (2 * a);

        return new double[]{r1, r2};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.print("enter the value cofficient A: ");
        double a = sc.nextDouble();
        System.out.print("enter the value cofficient B: ");
        double b = sc.nextDouble();
        System.out.print("enter the value constant c: ");
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);
        for (double r : roots)
            System.out.println("Root: " + r);
    }
}

