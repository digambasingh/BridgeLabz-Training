package com.collections.shoppingcart;

import java.util.*;

public class ShoppingCart {

    // Stores product prices
    static Map<String, Double> priceMap = new HashMap<>();

    // Maintains order of items added to cart
    static Map<String, Double> cartOrder = new LinkedHashMap<>();

    // Add product to store
    static void addProduct(String product, double price) {
        priceMap.put(product, price);
    }

    // Add item to cart
    static void addToCart(String product) {
        if (priceMap.containsKey(product)) {
            cartOrder.put(product, priceMap.get(product));
        } else {
            System.out.println("Product not found: " + product);
        }
    }

    // Display cart in insertion order
    static void displayCartOrder() {
        System.out.println("\nCart Items (Insertion Order):");
        for (Map.Entry<String, Double> entry : cartOrder.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // Display items sorted by price
    static void displaySortedByPrice() {
        System.out.println("\nCart Items (Sorted by Price):");

        TreeMap<Double, List<String>> sortedMap = new TreeMap<>();

        for (Map.Entry<String, Double> entry : cartOrder.entrySet()) {
            sortedMap
                .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                .add(entry.getKey());
        }

        for (Map.Entry<Double, List<String>> entry : sortedMap.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product + " : " + entry.getKey());
            }
        }
    }

    // Calculate total price
    static void calculateTotal() {
        double total = 0;
        for (double price : cartOrder.values()) {
            total += price;
        }
        System.out.println("\nTotal Amount: " + total);
    }

    public static void main(String[] args) {

        addProduct("Laptop", 55000);
        addProduct("Mouse", 500);
        addProduct("Keyboard", 1500);
        addProduct("Headphones", 2000);

        addToCart("Laptop");
        addToCart("Mouse");
        addToCart("Keyboard");
        addToCart("Headphones");

        displayCartOrder();
        displaySortedByPrice();
        calculateTotal();
    }
}
