package com.bridgelabz.bookshelf;

import java.util.*;

class BookShelf {

    // Genre  List of Books
    private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();

    // To avoid duplicate books
    private HashSet<String> isbnSet = new HashSet<>();

    // Add a book
    public void addBook(String genre, Book book) {

        if (isbnSet.contains(book.isbn)) {
            System.out.println("Duplicate book not allowed: " + book.title);
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        isbnSet.add(book.isbn);

        System.out.println("Added: " + book.title + " to " + genre);
    }

    // Borrow a book
    public void borrowBook(String genre, String isbn) {

        LinkedList<Book> books = catalog.get(genre);

        if (books == null || books.isEmpty()) {
            System.out.println("No books available in " + genre);
            return;
        }

        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            if (book.isbn.equals(isbn)) {
                it.remove();
                isbnSet.remove(isbn);
                System.out.println("Borrowed: " + book.title);
                return;
            }
        }

        System.out.println("Book not found!");
    }

    // Return a book
    public void returnBook(String genre, Book book) {
        addBook(genre, book);
    }

    // Display catalog
    public void displayCatalog() {
        System.out.println("Library Catalog:");

        for (String genre : catalog.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book book : catalog.get(genre)) {
                System.out.println(book);
            }
        }
    }
}

