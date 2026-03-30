package com.bridgelabz.restaurant;

class Reservation {
    private int tableNumber;
    private String timeSlot;
    private String customerName;

    public Reservation(int tableNumber, String timeSlot, String customerName) {
        this.tableNumber = tableNumber;
        this.timeSlot = timeSlot;
        this.customerName = customerName;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    @Override
    public String toString() {
        return "Table " + tableNumber + " reserved by " + customerName +
               " at " + timeSlot;
    }
}
