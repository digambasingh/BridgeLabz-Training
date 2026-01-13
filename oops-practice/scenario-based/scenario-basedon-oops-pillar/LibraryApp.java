package com.bridgelabz.scenario;

import java.util.*;

//custom exception
class BookNotAvailableException extends Exception {
 public BookNotAvailableException(String message) {
     super(message);
 }
}

//Book class
class Book {
 int id;
 String title;
 boolean available;

 Book(int id, String title) {
     this.id = id;
     this.title = title;
     this.available = true;
 }
}

//base user class
class User {
 int userId;
 String name;

 User(int userId, String name) {
     this.userId = userId;
     this.name = name;
 }
}

//Member class
class Member extends User {
 String type; // Student or Staff

 Member(int userId, String name, String type) {
     super(userId, name);
     this.type = type;
 }
}

//fine calculator interface
interface FineCalculator {
 double calculateFine(int days);
}

//student fine
class StudentFine implements FineCalculator {
 public double calculateFine(int days) {
     return days * 2;
 }
}

//staff fine
class StaffFine implements FineCalculator {
 public double calculateFine(int days) {
     return days * 1;
 }
}

//Transaction class
class Transaction {
 Book book;
 Member member;
 int daysLate;

 Transaction(Book book, Member member, int daysLate) {
     this.book = book;
     this.member = member;
     this.daysLate = daysLate;
 }
}

//Library class
class Library {
 List<Book> books;
 List<Transaction> transactions;

 Library() {
     books = new ArrayList<>();
     transactions = new ArrayList<>();
 }

 void addBook(Book book) {
     books.add(book);
     System.out.println("Book added: " + book.title);
 }

 void issueBook(int bookId, Member member)
         throws BookNotAvailableException {

     for (Book b : books) {
         if (b.id == bookId && b.available) {
             b.available = false;
             transactions.add(new Transaction(b, member, 0));
             System.out.println("Book issued to " + member.name);
             return;
         }
     }
     throw new BookNotAvailableException("Book not available");
 }

 void returnBook(int bookId, int daysLate, FineCalculator calculator) {
     for (Transaction t : transactions) {
         if (t.book.id == bookId) {
             t.book.available = true;
             t.daysLate = daysLate;

             double fine = calculator.calculateFine(daysLate);
             System.out.println("Book returned by " + t.member.name);
             System.out.println("Late fine: ₹" + fine);
             return;
         }
     }
     System.out.println("Transaction not found");
 }

 void showBooks() {
     System.out.println("---- Books ----");
     for (Book b : books) {
         System.out.println(b.id + " " + b.title +
                 " Available: " + b.available);
     }
 }
}

//main class
public class LibraryApp {
 public static void main(String[] args) {

     Library library = new Library();

     library.addBook(new Book(1, "Java Basics"));
     library.addBook(new Book(2, "Data Structures"));

     Member m1 = new Member(101, "Digambar", "Student");
     Member m2 = new Member(102, "Rahul", "Staff");

     try {
         library.issueBook(1, m1);
     } catch (BookNotAvailableException e) {
         System.out.println(e.getMessage());
     }

     FineCalculator studentFine = new StudentFine();
     library.returnBook(1, 5, studentFine);

     library.showBooks();
 }
}

