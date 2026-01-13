package com.bridgelabz.scenario;

import java.util.*;

//Ticket class
class Ticket {
 int price;

 Ticket(int price) {
     this.price = price;
 }
}

//Event Manager
class EventManager {

 // quick sort method
 void quickSort(Ticket[] tickets, int low, int high) {
     if (low < high) {
         int pivotIndex = partition(tickets, low, high);

         quickSort(tickets, low, pivotIndex - 1);
         quickSort(tickets, pivotIndex + 1, high);
     }
 }

 // partition logic
 int partition(Ticket[] tickets, int low, int high) {
     int pivot = tickets[high].price;
     int i = low - 1;

     for (int j = low; j < high; j++) {
         if (tickets[j].price < pivot) {
             i++;
             swap(tickets, i, j);
         }
     }
     swap(tickets, i + 1, high);
     return i + 1;
 }

 // swap helper
 void swap(Ticket[] tickets, int i, int j) {
     Ticket temp = tickets[i];
     tickets[i] = tickets[j];
     tickets[j] = temp;
 }

 // display tickets
 void showTickets(Ticket[] tickets) {
     for (Ticket t : tickets) {
         System.out.print(t.price + " ");
     }
     System.out.println();
 }
}

//main class
public class EventManagerApp {
 public static void main(String[] args) {

     Ticket[] tickets = {
         new Ticket(1500),
         new Ticket(500),
         new Ticket(2000),
         new Ticket(800),
         new Ticket(1200),
         new Ticket(300)
     };

     EventManager manager = new EventManager();

     System.out.println("Before Sorting:");
     manager.showTickets(tickets);

     manager.quickSort(tickets, 0, tickets.length - 1);

     System.out.println("After Sorting:");
     manager.showTickets(tickets);

     System.out.println("Cheapest Ticket: " + tickets[0].price);
     System.out.println("Most Expensive Ticket: " +
             tickets[tickets.length - 1].price);
 }
}


