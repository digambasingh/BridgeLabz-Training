package com.bridgelabz.dsa;

class BookNode {
    int bookId;
    String title;
    String author;
    String genre;
    boolean isAvailable;

    BookNode next;
    BookNode prev;

    public BookNode(int bookId, String title, String author,
                    String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}


class LibraryDoublyLinkedList {

    private BookNode head;
    private BookNode tail;

    /* ---------------- ADD OPERATIONS ---------------- */

    // Add at beginning
    public void addAtBeginning(int id, String title, String author,
                               String genre, boolean available) {
        BookNode newNode = new BookNode(id, title, author, genre, available);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(int id, String title, String author,
                         String genre, boolean available) {
        BookNode newNode = new BookNode(id, title, author, genre, available);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Add at specific position (1-based index)
    public void addAtPosition(int pos, int id, String title,
                              String author, String genre, boolean available) {
        if (pos <= 1) {
            addAtBeginning(id, title, author, genre, available);
            return;
        }

        BookNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp == tail) {
            addAtEnd(id, title, author, genre, available);
            return;
        }

        BookNode newNode = new BookNode(id, title, author, genre, available);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    /* ---------------- REMOVE ---------------- */

    public void removeByBookId(int id) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {

                if (temp == head)
                    head = temp.next;

                if (temp == tail)
                    tail = temp.prev;

                if (temp.prev != null)
                    temp.prev.next = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;

                return;
            }
            temp = temp.next;
        }
    }

    /* ---------------- SEARCH ---------------- */

    public BookNode searchByTitle(String title) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public BookNode searchByAuthor(String author) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    /* ---------------- UPDATE ---------------- */

    public void updateAvailability(int id, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = status;
                return;
            }
            temp = temp.next;
        }
    }

    /* ---------------- DISPLAY ---------------- */

    public void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            printBook(temp);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            printBook(temp);
            temp = temp.prev;
        }
    }

    private void printBook(BookNode b) {
        System.out.println(
            b.bookId + " | " + b.title + " | " + b.author +
            " | " + b.genre + " | " +
            (b.isAvailable ? "Available" : "Issued")
        );
    }

    /* ---------------- COUNT ---------------- */

    public int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class LibraryApp {
    public static void main(String[] args) {

        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.addAtEnd(101, "Java Basics", "James Gosling", "Programming", true);
        library.addAtBeginning(102, "Data Structures", "Mark Allen", "CS", true);
        library.addAtEnd(103, "Clean Code", "Robert Martin", "Software", false);

        System.out.println("📘 Library Books (Forward):");
        library.displayForward();

        System.out.println("\n📕 Library Books (Reverse):");
        library.displayReverse();

        library.updateAvailability(103, true);

        System.out.println("\nTotal Books: " + library.countBooks());

        BookNode book = library.searchByAuthor("Robert Martin");
        if (book != null)
            System.out.println("\nSearch Result: " + book.title);
    }
}
