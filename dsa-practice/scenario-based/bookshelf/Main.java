package com.bridgelabz.bookshelf;

public class Main {
    public static void main(String[] args) {

        BookShelf library = new BookShelf();

        Book b1 = new Book("BN101", "Clean Code", "Robert C. Martin");
        Book b2 = new Book("BN102", "Effective Java", "Joshua Bloch");
        Book b3 = new Book("BN103", "Harry Potter", "J.K. Rowling");

        library.addBook("Programming", b1);
        library.addBook("Programming", b2);
        library.addBook("Fantasy", b3);

        library.displayCatalog();

        library.borrowBook("Programming", "BN101");
        library.displayCatalog();

        library.returnBook("Programming", b1);
        library.displayCatalog();
    }
}

