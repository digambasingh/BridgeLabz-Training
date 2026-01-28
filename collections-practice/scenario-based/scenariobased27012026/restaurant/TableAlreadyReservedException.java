package com.bridgelabz.restaurant;

class TableAlreadyReservedException extends Exception {
    public TableAlreadyReservedException(String message) {
        super(message);
    }
}
