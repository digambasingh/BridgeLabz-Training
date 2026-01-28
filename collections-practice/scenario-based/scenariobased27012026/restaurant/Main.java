package com.bridgelabz.restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        restaurant.addTable(new Table(1, 4));
        restaurant.addTable(new Table(2, 6));

        try {
            restaurant.reserveTable(1, "7PM-8PM", "Rahul");
            restaurant.reserveTable(1, "7PM-8PM", "Amit"); // exception
        } catch (TableAlreadyReservedException e) {
            System.out.println(e.getMessage());
        }

        restaurant.showAvailableTables("7PM-8PM");
    }
}
