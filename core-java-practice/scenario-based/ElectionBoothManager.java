package com.scenerio;

//Scenario Based 

//Election Booth Manager ️
//Design a polling booth system.
// Take age input.
// Use if to check if eligible (>=18).
// Record vote (1, 2, or 3 for candidates).
// Loop for multiple voters, exit on special code.

import java.util.Scanner;

public class ElectionBoothManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;

        while (true) {
            System.out.print("Enter voter age (-1 to exit): ");
            int age = sc.nextInt();

            // Exit condition
            if (age == -1) {
                break;
            }

            // Eligibility check
            if (age >= 18) {
                System.out.println("Eligible to vote.");
                System.out.print("Vote for candidate (1 / 2 / 3): ");
                int vote = sc.nextInt();

                if (vote == 1) {
                    candidate1Votes++;
                } else if (vote == 2) {
                    candidate2Votes++;
                } else if (vote == 3) {
                    candidate3Votes++;
                } else {
                    System.out.println("Invalid vote!");
                }
            } else {
                System.out.println("Not eligible to vote.");
            }
        }

        // Display results
        System.out.println("\n🗳️ Election Results:");
        System.out.println("Candidate 1 Votes: " + candidate1Votes);
        System.out.println("Candidate 2 Votes: " + candidate2Votes);
        System.out.println("Candidate 3 Votes: " + candidate3Votes);

        sc.close();
    }
}
