package com.bridgelabz.scenario;

import java.util.*;

//custom exception
class RoomNotAvailableException extends Exception {
 public RoomNotAvailableException(String message) {
     super(message);
 }
}

//Guest class
class Guest {
 int id;
 String name;

 Guest(int id, String name) {
     this.id = id;
     this.name = name;
 }
}

//Room base class
class Room {
 int roomNo;
 double basePrice;
 boolean available;

 Room(int roomNo, double basePrice) {
     this.roomNo = roomNo;
     this.basePrice = basePrice;
     this.available = true;
 }

 double getPrice() {
     return basePrice;
 }
}

//Standard room
class StandardRoom extends Room {

 StandardRoom(int roomNo) {
     super(roomNo, 2000);
 }
}

//Deluxe room
class DeluxeRoom extends Room {

 DeluxeRoom(int roomNo) {
     super(roomNo, 4000);
 }
}

//pricing interface
interface PricingStrategy {
 double calculatePrice(double basePrice, int days);
}

//normal season pricing
class NormalPricing implements PricingStrategy {
 public double calculatePrice(double basePrice, int days) {
     return basePrice * days;
 }
}

//peak season pricing
class PeakSeasonPricing implements PricingStrategy {
 public double calculatePrice(double basePrice, int days) {
     return (basePrice * days) + 1000;
 }
}

//Reservation class
class Reservation {
 int id;
 Guest guest;
 Room room;
 int days;

 Reservation(int id, Guest guest, Room room, int days) {
     this.id = id;
     this.guest = guest;
     this.room = room;
     this.days = days;
 }
}

//Hotel service
class Hotel {

 List<Room> rooms;
 List<Reservation> reservations;
 int reservationId = 1;

 Hotel() {
     rooms = new ArrayList<>();
     reservations = new ArrayList<>();
 }

 void addRoom(Room room) {
     rooms.add(room);
 }

 Room findAvailableRoom(Class<?> roomType)
         throws RoomNotAvailableException {

     for (Room r : rooms) {
         if (r.available && r.getClass() == roomType) {
             return r;
         }
     }
     throw new RoomNotAvailableException("Room not available");
 }

 void bookRoom(Guest guest, Class<?> roomType,
               int days, PricingStrategy pricing)
         throws RoomNotAvailableException {

     Room room = findAvailableRoom(roomType);
     room.available = false;

     Reservation res = new Reservation(
             reservationId++, guest, room, days);
     reservations.add(res);

     double bill = pricing.calculatePrice(room.getPrice(), days);

     System.out.println("Room booked for " + guest.name);
     System.out.println("Room No: " + room.roomNo);
     System.out.println("Total Bill: ₹" + bill);
 }

 void checkOut(int reservationId) {
     for (Reservation r : reservations) {
         if (r.id == reservationId) {
             r.room.available = true;
             System.out.println("Checked out room " + r.room.roomNo);
             return;
         }
     }
     System.out.println("Reservation not found");
 }
}

//main class
public class HotelReservationApp {
 public static void main(String[] args) {

     Hotel hotel = new Hotel();

     hotel.addRoom(new StandardRoom(101));
     hotel.addRoom(new DeluxeRoom(201));

     Guest g1 = new Guest(1, "Digambar");

     PricingStrategy normal = new NormalPricing();
     PricingStrategy peak = new PeakSeasonPricing();

     try {
         hotel.bookRoom(g1, StandardRoom.class, 2, normal);
         hotel.bookRoom(g1, DeluxeRoom.class, 3, peak);
     } catch (RoomNotAvailableException e) {
         System.out.println(e.getMessage());
     }

     hotel.checkOut(1);
 }
}

