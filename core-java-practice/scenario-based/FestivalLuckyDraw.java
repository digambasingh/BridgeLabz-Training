package com.scenerio;

//Festival Lucky Draw 🎉
//At Diwali mela, each visitor draws a number.
//● If the number is divisible by 3 and 5, they win a gift.
//● Use if, modulus, and loop for multiple visitors.
//● continue if input is invalid.

import java.util.Scanner;

public class FestivalLuckyDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter lucky draw number (or type 'exit' to stop): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);

                if (number % 3 == 0 && number % 5 == 0) {
                    System.out.println("🎁 Congratulations! You won a gift!");
                } else {
                    System.out.println("Sorry, better luck next time.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Try again.");
                continue;
            }
        }

        sc.close();
    }
}

