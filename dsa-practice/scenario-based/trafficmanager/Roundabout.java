package com.bridgelabz.trafficmanager;

class Roundabout {

    private VehicleNode head;

    // Add vehicle to roundabout
    public void addVehicle(String vehicleNumber) {
        VehicleNode newNode = new VehicleNode(vehicleNumber);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        VehicleNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Remove vehicle from roundabout
    public void removeVehicle(String vehicleNumber) {
        if (head == null) {
            System.out.println("Roundabout is empty!");
            return;
        }

        VehicleNode curr = head, prev = null;

        do {
            if (curr.vehicleNumber.equals(vehicleNumber)) {

                if (curr == head && curr.next == head) {
                    head = null;
                } else {
                    if (curr == head) {
                        head = head.next;
                    }
                    if (prev != null) {
                        prev.next = curr.next;
                    }
                }
                System.out.println("Vehicle exited: " + vehicleNumber);
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Vehicle not found!");
    }

    // Print roundabout state
    public void printRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        System.out.print("Roundabout Vehicles: ");
        VehicleNode temp = head;

        do {
            System.out.print(temp.vehicleNumber + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to start)");
    }
}

