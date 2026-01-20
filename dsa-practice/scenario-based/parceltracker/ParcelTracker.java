package com.bridgelabz.parcelTracker;

public class ParcelTracker {

    private StageNode head;

    // Add stage at end
    public void addStage(String stageName) {
        StageNode newNode = new StageNode(stageName);

        if (head == null) {
            head = newNode;
            return;
        }

        StageNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addCheckpoint(String afterStage, String newStage) {
        StageNode temp = head;

        while (temp != null && !temp.stageName.equals(afterStage)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage not found: " + afterStage);
            return;
        }

        StageNode newNode = new StageNode(newStage);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //  Forward tracking
    public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel data missing!");
            return;
        }

        StageNode temp = head;
        System.out.print("Parcel Status: ");

        while (temp != null) {
            System.out.print(temp.stageName);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    //  Handle lost/missing parcel
    public void markLost() {
        head = null;
        System.out.println("Parcel is LOST");
    }
}
