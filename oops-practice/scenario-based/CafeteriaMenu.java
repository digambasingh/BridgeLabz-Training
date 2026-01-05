package com.scenario;

import java.util.Scanner;

public class CafeteriaMenu {

    static String[] menu = {
        "Idli", "Dosa", "Vada", "Pav Bhaji", "Sandwich",
        "Burger", "Pizza", "Pasta", "Tea", "Coffee"
    };

    public static void displayMenu() {
        System.out.println("----- Cafeteria Menu -----");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + " : " + menu[i]);
        }
    }

    public static String getItemByIndex(int index) {
        if (index >= 0 && index < menu.length) {
            return menu[index];
        } else {
            return "Invalid selection";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        displayMenu();

        System.out.print("Select item by index: ");
        int choice = sc.nextInt();

        System.out.println("You selected: " + getItemByIndex(choice));
    }
}

