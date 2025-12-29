package com.bridgelabz.extra.scenerio;

import java.util.Scanner;

public class BasicCalculator {

    static double add(double a, double b) { return a + b; }
    static double subtract(double a, double b) { return a - b; }
    static double multiply(double a, double b) { return a * b; }
    static double divide(double a, double b) { return a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide");
        System.out.print("Choose operation: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: System.out.println(add(a, b)); break;
            case 2: System.out.println(subtract(a, b)); break;
            case 3: System.out.println(multiply(a, b)); break;
            case 4: System.out.println(divide(a, b)); break;
            default: System.out.println("Invalid choice");
        }
    }
}

