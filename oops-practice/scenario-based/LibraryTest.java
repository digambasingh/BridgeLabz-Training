package com.scenario;

class Book {
    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
}

class Library {

    Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    // Display all books
    public void displayBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(
                (i + 1) + ". " + books[i].title + " - " + books[i].author +
                " [" + (books[i].isAvailable ? "Available" : "Checked Out") + "]"
            );
        }
    }

    // Search by partial title
    public void searchByTitle(String keyword) {
        System.out.println("Search results for: " + keyword);
        for (Book book : books) {
            if (book.title.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(book.title + " by " + book.author);
            }
        }
    }

    // Checkout book
    public void checkoutBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                if (book.isAvailable) {
                    book.isAvailable = false;
                    System.out.println("Book checked out successfully.");
                } else {
                    System.out.println("Book already checked out.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}


public class LibraryTest {
    public static void main(String[] args) {

        Book[] books = {
            new Book("Java Programming", "James Gosling"),
            new Book("Data Structures", "Mark Weiss"),
            new Book("Clean Code", "Robert Martin")
        };

        Library library = new Library(books);

        library.displayBooks();
        library.searchByTitle("data");
        library.checkoutBook("Clean Code");
        library.displayBooks();
    }
}

