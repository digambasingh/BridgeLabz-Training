package com.bridgelabz.lambdaexpression;

import java.util.*;

class Product {
    String name;
    double price;
    double rating;

    Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String toString() {
        return name + " | " + price + " | " + rating;
    }
}

public class ProductSorting {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 55000, 4.5));
        products.add(new Product("Phone", 20000, 4.7));
        products.add(new Product("Tablet", 30000, 4.2));

        // Sort by price
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));

        products.forEach(System.out::println);
    }
}

