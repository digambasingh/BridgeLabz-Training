package com.bridgelabz.scenario;

import java.util.*;

//custom exception
class PaymentFailedException extends Exception {
 public PaymentFailedException(String msg) {
     super(msg);
 }
}

//Product class
class Product {
 int id;
 String name;
 double price;

 Product(int id, String name, double price) {
     this.id = id;
     this.name = name;
     this.price = price;
 }
}

//Customer class
class Customer {
 int customerId;
 String customerName;

 Customer(int customerId, String customerName) {
     this.customerId = customerId;
     this.customerName = customerName;
 }
}

//Payment interface
interface Payment {
 void pay(double amount) throws PaymentFailedException;
}

//Card payment
class CardPayment implements Payment {
 public void pay(double amount) throws PaymentFailedException {
     if (amount <= 0) {
         throw new PaymentFailedException("Invalid amount");
     }
     System.out.println("Payment of ₹" + amount + " done using Card");
 }
}

//UPI payment
class UPIPayment implements Payment {
 public void pay(double amount) throws PaymentFailedException {
     if (amount > 50000) {
         throw new PaymentFailedException("UPI limit exceeded");
     }
     System.out.println("Payment of ₹" + amount + " done using UPI");
 }
}

//Order class
class Order {
 int orderId;
 Product product;
 Customer customer;
 String status;

 Order(int orderId, Product product, Customer customer) {
     this.orderId = orderId;
     this.product = product;
     this.customer = customer;
     this.status = "PLACED";
 }

 void cancelOrder() {
     status = "CANCELLED";
     System.out.println("Order cancelled successfully");
 }

 void trackOrder() {
     System.out.println("Order Status: " + status);
 }
}

//Main class
public class EcommerceApp {
 public static void main(String[] args) {

     // product catalog
     Product p1 = new Product(101, "Laptop", 55000);
     Product p2 = new Product(102, "Mouse", 700);

     // customer
     Customer c1 = new Customer(1, "Digambar");

     // placing order
     Order order1 = new Order(1, p1, c1);

     // choosing payment method
     Payment payment = new UPIPayment();

     try {
         payment.pay(p1.price);
         System.out.println("Order placed for " + p1.name);
     } catch (PaymentFailedException e) {
         System.out.println("Payment failed: " + e.getMessage());
     }

     // track order
     order1.trackOrder();

     // cancel order
     order1.cancelOrder();
     order1.trackOrder();
 }
}
