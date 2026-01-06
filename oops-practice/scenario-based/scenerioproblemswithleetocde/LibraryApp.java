package com.scenario;
import java.util.*;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String msg) {
        super(msg);
    }
}

class Books {
    String title;
    String author;
    boolean available;

    public Books(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }
}

class LibraryGLA {
    List<Books> books = new ArrayList<>();

    public void addBook(Books b) {
        books.add(b);
    }

    public void searchByTitle(String keyword) {
        for (Books b : books) {
            if (b.title.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(b.title + " - " + b.author + " - " +
                        (b.available ? "Available" : "Checked Out"));
            }
        }
    }

    public void checkoutBook(String title) throws BookNotAvailableException {
        for (Books b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                if (!b.available)
                    throw new BookNotAvailableException("Book already checked out");
                b.available = false;
                System.out.println("Book checked out");
                return;
            }
        }
        System.out.println("Book not found");
    }
}

public class LibraryApp {
    public static void main(String[] args) {

        LibraryGLA library = new LibraryGLA();

        library.addBook(new Books("Java Programming", "James Gosling"));
        library.addBook(new Books("Python Basics", "Guido"));

        library.searchByTitle("java");

        try {
            library.checkoutBook("Java Programming");
            library.checkoutBook("Java Programming"); // already checked out
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
