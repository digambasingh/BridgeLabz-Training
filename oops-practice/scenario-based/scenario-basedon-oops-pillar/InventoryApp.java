package com.bridgelabz.scenario;

import java.util.*;

//custom exception
class OutOfStockException extends Exception {
 public OutOfStockException(String message) {
     super(message);
 }
}

//Product class
class Product {
 int id;
 String name;
 int quantity;

 Product(int id, String name, int quantity) {
     this.id = id;
     this.name = name;
     this.quantity = quantity;
 }
}

//alert interface
interface AlertService {
 void lowStockAlert(Product product);
}

//alert implementation
class EmailAlert implements AlertService {
 public void lowStockAlert(Product product) {
     System.out.println("ALERT: Low stock for " + product.name);
 }
}

//Inventory class
class Inventory {
 private List<Product> products;
 private AlertService alertService;

 Inventory(AlertService alertService) {
     this.alertService = alertService;
     products = new ArrayList<>();
 }

 void addProduct(Product product) {
     products.add(product);
     System.out.println("Product added: " + product.name);
 }

 void updateStock(int productId, int quantity) throws OutOfStockException {
     for (Product p : products) {
         if (p.id == productId) {
             if (p.quantity + quantity < 0) {
                 throw new OutOfStockException("Not enough stock");
             }
             p.quantity += quantity;

             System.out.println("Updated stock for " + p.name +
                     " | Quantity: " + p.quantity);

             if (p.quantity <= 5) {
                 alertService.lowStockAlert(p);
             }
             return;
         }
     }
     System.out.println("Product not found");
 }

 void showInventory() {
     System.out.println("---- Inventory ----");
     for (Product p : products) {
         System.out.println(p.id + " " + p.name + " Qty: " + p.quantity);
     }
 }
}

//main class
public class InventoryApp {
 public static void main(String[] args) {

     AlertService alert = new EmailAlert();
     Inventory inventory = new Inventory(alert);

     Product p1 = new Product(1, "Keyboard", 10);
     Product p2 = new Product(2, "Monitor", 4);

     inventory.addProduct(p1);
     inventory.addProduct(p2);

     inventory.showInventory();

     try {
         inventory.updateStock(1, -6);
         inventory.updateStock(2, -3);
     } catch (OutOfStockException e) {
         System.out.println(e.getMessage());
     }

     inventory.showInventory();
 }
}

