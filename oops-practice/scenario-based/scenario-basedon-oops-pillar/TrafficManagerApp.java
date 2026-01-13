package com.bridgelabz.scenario;

import java.util.*;

//vehicle node for circular linked list
class VehicleNode {
 String vehicleNumber;
 VehicleNode next;

 VehicleNode(String vehicleNumber) {
     this.vehicleNumber = vehicleNumber;
     this.next = null;
 }
}

//Traffic Manager
class TrafficManager {

 private VehicleNode head = null;
 private VehicleNode tail = null;

 private Queue<String> waitingQueue = new LinkedList<>();
 private int MAX_ROUNDABOUT = 5;

 // add vehicle to waiting queue
 void addToQueue(String vehicleNo) {
     waitingQueue.add(vehicleNo);
     System.out.println(vehicleNo + " added to waiting queue");
 }

 // move vehicle from queue to roundabout
 void enterRoundabout() {
     if (getCount() >= MAX_ROUNDABOUT) {
         System.out.println("Roundabout full. Vehicle waiting...");
         return;
     }

     if (waitingQueue.isEmpty()) {
         System.out.println("No vehicles in queue");
         return;
     }

     String vehicleNo = waitingQueue.poll();
     VehicleNode newNode = new VehicleNode(vehicleNo);

     if (head == null) {
         head = tail = newNode;
         newNode.next = head;
     } else {
         tail.next = newNode;
         tail = newNode;
         tail.next = head;
     }

     System.out.println(vehicleNo + " entered roundabout");
 }

 // remove vehicle from roundabout
 void exitRoundabout(String vehicleNo) {
     if (head == null) {
         System.out.println("Roundabout empty");
         return;
     }

     VehicleNode curr = head;
     VehicleNode prev = tail;

     do {
         if (curr.vehicleNumber.equals(vehicleNo)) {

             if (curr == head && curr == tail) {
                 head = tail = null;
             } else {
                 prev.next = curr.next;
                 if (curr == head) head = curr.next;
                 if (curr == tail) tail = prev;
             }

             System.out.println(vehicleNo + " exited roundabout");
             return;
         }

         prev = curr;
         curr = curr.next;

     } while (curr != head);

     System.out.println("Vehicle not found in roundabout");
 }

 // count vehicles in roundabout
 int getCount() {
     if (head == null) return 0;

     int count = 0;
     VehicleNode temp = head;
     do {
         count++;
         temp = temp.next;
     } while (temp != head);

     return count;
 }

 // print roundabout state
 void printRoundabout() {
     if (head == null) {
         System.out.println("Roundabout is empty");
         return;
     }

     System.out.print("Roundabout: ");
     VehicleNode temp = head;
     do {
         System.out.print(temp.vehicleNumber + " -> ");
         temp = temp.next;
     } while (temp != head);
     System.out.println("(back to start)");
 }
}

//main class
public class TrafficManagerApp {
 public static void main(String[] args) {

     TrafficManager tm = new TrafficManager();

     tm.addToQueue("CAR-101");
     tm.addToQueue("CAR-102");
     tm.addToQueue("CAR-103");
     tm.addToQueue("CAR-104");

     tm.enterRoundabout();
     tm.enterRoundabout();
     tm.enterRoundabout();

     tm.printRoundabout();

     tm.exitRoundabout("CAR-102");
     tm.printRoundabout();

     tm.enterRoundabout();
     tm.printRoundabout();
 }
}
