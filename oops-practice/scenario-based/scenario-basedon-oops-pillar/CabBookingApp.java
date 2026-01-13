package com.bridgelabz.scenario;

import java.util.*;

//custom exception
class NoDriverAvailableException extends Exception {
 public NoDriverAvailableException(String message) {
     super(message);
 }
}

//User class
class User {
 int id;
 String name;

 User(int id, String name) {
     this.id = id;
     this.name = name;
 }
}

//Driver class
class Driver {
 int id;
 String name;
 boolean available;

 Driver(int id, String name) {
     this.id = id;
     this.name = name;
     this.available = true;
 }
}

//Ride class
class Ride {
 User user;
 Driver driver;
 double distance;
 double fare;

 Ride(User user, Driver driver, double distance, double fare) {
     this.user = user;
     this.driver = driver;
     this.distance = distance;
     this.fare = fare;
 }
}

//fare interface
interface FareCalculator {
 double calculateFare(double distance);
}

//normal pricing
class NormalFare implements FareCalculator {
 public double calculateFare(double distance) {
     return distance * 10;
 }
}

//peak pricing
class PeakFare implements FareCalculator {
 public double calculateFare(double distance) {
     return distance * 15;
 }
}

//service class
class RideService {

 private List<Driver> drivers;
 private List<Ride> rideHistory;

 RideService() {
     drivers = new ArrayList<>();
     rideHistory = new ArrayList<>();
 }

 void addDriver(Driver driver) {
     drivers.add(driver);
 }

 Driver assignDriver() throws NoDriverAvailableException {
     for (Driver d : drivers) {
         if (d.available) {
             d.available = false;
             return d;
         }
     }
     throw new NoDriverAvailableException("No driver available right now");
 }

 void bookRide(User user, double distance, FareCalculator calculator) {
     try {
         Driver driver = assignDriver();
         double fare = calculator.calculateFare(distance);

         Ride ride = new Ride(user, driver, distance, fare);
         rideHistory.add(ride);

         System.out.println("Ride booked for " + user.name);
         System.out.println("Driver: " + driver.name);
         System.out.println("Fare: ₹" + fare);

     } catch (NoDriverAvailableException e) {
         System.out.println(e.getMessage());
     }
 }

 void showRideHistory() {
     System.out.println("---- Ride History ----");
     for (Ride r : rideHistory) {
         System.out.println(r.user.name + " | " +
                            r.driver.name + " | " +
                            r.distance + " km | ₹" + r.fare);
     }
 }
}

//main class
public class CabBookingApp {
 public static void main(String[] args) {

     RideService service = new RideService();

     service.addDriver(new Driver(1, "Ramesh"));
     service.addDriver(new Driver(2, "Suresh"));

     User u1 = new User(101, "Digambar");

     FareCalculator normalFare = new NormalFare();
     FareCalculator peakFare = new PeakFare();

     service.bookRide(u1, 5, normalFare);
     service.bookRide(u1, 8, peakFare);

     service.showRideHistory();
 }
}
