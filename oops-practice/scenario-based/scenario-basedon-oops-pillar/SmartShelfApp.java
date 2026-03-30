package com.bridgelabz.scenario;

import java.util.*;

//Book class
class Book {
 String title;

 Book(String title) {
     this.title = title;
 }
}

//SmartShelf class
class SmartShelf {

 private List<Book> books = new ArrayList<>();

 // add book and keep list sorted
 void addBook(String title) {
     Book newBook = new Book(title);
     books.add(newBook);

     // insertion sort logic (only last element)
     int i = books.size() - 2;
     while (i >= 0 &&
             books.get(i).title.compareToIgnoreCase(newBook.title) > 0) {

         books.set(i + 1, books.get(i));
         i--;
     }
     books.set(i + 1, newBook);

     System.out.println("Added: " + title);
 }

 // display shelf
 void showShelf() {
     System.out.println("---- Smart Shelf ----");
     for (Book b : books) {
         System.out.println(b.title);
     }
 }
}

//main class
public class SmartShelfApp {
 public static void main(String[] args) {

     SmartShelf shelf = new SmartShelf();

     shelf.addBook("Java Programming");
     shelf.addBook("Algorithms");
     shelf.addBook("Data Structures");
     shelf.addBook("Operating Systems");

     shelf.showShelf();
 }
}
