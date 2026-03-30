package com.scenerio;

//Metro Smart Card Fare Deduction 🚇
//In Delhi Metro, fare varies by distance.
// Ask the user for distance.
// Calculate fare using ternary operator.
// Deduct from smart card balance.
//Loop until balance is exhausted or the user quits.

import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 100;   // Initial smart card balance
        int distance;
        double fare;

        while (balance > 0) {
            System.out.println("Current Balance: Rupees " + balance);
            System.out.print("Enter distance in km (-1 to quit): ");
            distance = sc.nextInt();

            // Exit condition
            if (distance == -1) {
                break;
            }

            // Fare calculation using ternary operator
            fare = (distance <= 5) ? 10 :
                   (distance <= 15) ? 20 : 30;

            // Check sufficient balance
            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare Rupees " + fare + " deducted.");
            } else {
                System.out.println("Insufficient balance!");
                break;
            }
        }

        System.out.println("\nJourney ended.");
        System.out.println("Remaining Balance: ₹" + balance);

        sc.close();
    }
}

