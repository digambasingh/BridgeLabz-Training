package com.bridgelabz.classandobject;

class MovieTicket {
    String movieName, seatNumber;
    double price;
    boolean booked = false;

    void book(String movie, String seat, double price) {
        if (booked) {
            System.out.println("House full!!! sorry..... Ticket already booked");
        } else {
            this.movieName = movie;
            this.seatNumber = seat;
            this.price = price;
            booked = true;
            System.out.println("Ticket booked for movie: " + movie);
            System.out.println("Seat Number: " + seat);
        }
    }

    void display() {
        if (!booked)
            System.out.println("Ticket have not booked yet....");
        else
            System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        MovieTicket t = new MovieTicket();
        t.display();
        t.book("Dragon", "A10", 120);
        t.book("Dragon", "A10", 120);
        t.display();
    }
}

