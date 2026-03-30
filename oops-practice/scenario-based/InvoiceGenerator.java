package com.scenario;

public class InvoiceGenerator {

    public static void parseInvoice(String input) {
        String[] tasks = input.split(",");

        for (String task : tasks) {
            System.out.println(task.trim());
        }

        int total = getTotalAmount(tasks);
        System.out.println("Total Invoice Amount = " + total + " INR");
    }

    public static int getTotalAmount(String[] tasks) {
        int total = 0;

        for (String task : tasks) {
            // Split by "-"
            String[] parts = task.split("-");

            // parts[1] = " 3000 INR"
            String amountPart = parts[1].trim().split(" ")[0];

            int amount = Integer.parseInt(amountPart);
            total += amount;
        }

        return total;
    }

    public static void main(String[] args) {
        String input = "Logo Design - 3000 INR, Web Page - 4500 INR";
        parseInvoice(input);
    }
}

