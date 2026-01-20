package com.bridgelabz.trafficmanager;

class WaitingQueue {
    private String[] queue;
    private int front, rear, size, capacity;

    public WaitingQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = rear = size = 0;
    }

    // Enqueue
    public void addVehicle(String vehicle) {
        if (isFull()) {
            System.out.println("Queue Overflow : Waiting area full");
            return;
        }
        queue[rear] = vehicle;
        rear = (rear + 1) % capacity;
        size++;
    }

    // Dequeue
    public String removeVehicle() {
        if (isEmpty()) {
            System.out.println("Queue Underflow : No vehicles waiting");
            return null;
        }
        String vehicle = queue[front];
        front = (front + 1) % capacity;
        size--;
        return vehicle;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
