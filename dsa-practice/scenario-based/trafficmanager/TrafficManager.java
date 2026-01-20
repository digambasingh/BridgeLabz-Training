package com.bridgelabz.trafficmanager;

public class TrafficManager {
    public static void main(String[] args) {

        Roundabout roundabout = new Roundabout();
        WaitingQueue waitingQueue = new WaitingQueue(3);

        // Vehicles arrive
        waitingQueue.addVehicle("CAR-101");
        waitingQueue.addVehicle("CAR-102");
        waitingQueue.addVehicle("CAR-103");
        waitingQueue.addVehicle("CAR-104"); // Overflow

        // Move vehicles into roundabout
        roundabout.addVehicle(waitingQueue.removeVehicle());
        roundabout.addVehicle(waitingQueue.removeVehicle());

        roundabout.printRoundabout();

        // Vehicle exits
        roundabout.removeVehicle("CAR-101");
        roundabout.printRoundabout();

        // Add more vehicles
        roundabout.addVehicle(waitingQueue.removeVehicle());
        roundabout.printRoundabout();
    }
}

