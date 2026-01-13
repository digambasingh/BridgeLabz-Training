package com.bridgelabz.dsa;

class MovieNode {
    Movie data;
    MovieNode next;
    MovieNode prev;

    public MovieNode(Movie data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class Movie {
    private String title;
    private String director;
    private int year;
    private double rating;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Title: " + title +
               ", Director: " + director +
               ", Year: " + year +
               ", Rating: " + rating;
    }
}



class MovieDoublyLinkedList {

    private MovieNode head;
    private MovieNode tail;

    // 1. Add at beginning
    public void addAtBeginning(Movie movie) {
        MovieNode node = new MovieNode(movie);

        if (head == null) {
            head = tail = node;
            return;
        }

        node.next = head;
        head.prev = node;
        head = node;
    }

    // 2. Add at end
    public void addAtEnd(Movie movie) {
        MovieNode node = new MovieNode(movie);

        if (tail == null) {
            head = tail = node;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    // 3. Add at specific position
    public void addAtPosition(Movie movie, int position) {
        if (position == 1) {
            addAtBeginning(movie);
            return;
        }

        MovieNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(movie);
            return;
        }

        MovieNode node = new MovieNode(movie);
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
    }

    // 4. Remove by movie title
    public void removeByTitle(String title) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        MovieNode temp = head;

        while (temp != null) {
            if (temp.data.getTitle().equalsIgnoreCase(title)) {

                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found");
    }

    // 5. Search by director
    public void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.data.getDirector().equalsIgnoreCase(director)) {
                System.out.println(temp.data);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found for director: " + director);
        }
    }

    // 6. Search by rating
    public void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.data.getRating() >= rating) {
                System.out.println(temp.data);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found with rating >= " + rating);
        }
    }

    // 7. Update rating by title
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.data.getTitle().equalsIgnoreCase(title)) {
                temp.data.setRating(newRating);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found");
    }

    // 8. Display forward
    public void displayForward() {
        if (head == null) {
            System.out.println("No movies available");
            return;
        }

        MovieNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // 9. Display reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies available");
            return;
        }

        MovieNode temp = tail;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }
}

public class MovieManagementSystem {
    public static void main(String[] args) {

        MovieDoublyLinkedList list = new MovieDoublyLinkedList();

        list.addAtEnd(new Movie("Inception", "Nolan", 2010, 8.8));
        list.addAtBeginning(new Movie("Interstellar", "Nolan", 2014, 8.6));
        list.addAtEnd(new Movie("Avatar", "Cameron", 2009, 7.8));
        list.addAtPosition(new Movie("Titanic", "Cameron", 1997, 7.9), 2);

        System.out.println("Forward Display:");
        list.displayForward();

        System.out.println("\nReverse Display:");
        list.displayReverse();

        System.out.println("\nSearch by Director (Nolan):");
        list.searchByDirector("Nolan");

        System.out.println("\nUpdate Rating:");
        list.updateRating("Avatar", 8.1);
        list.displayForward();

        System.out.println("\nRemove Movie:");
        list.removeByTitle("Titanic");
        list.displayForward();
    }
}

