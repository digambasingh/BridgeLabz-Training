package com.collections;

public class CircularBuffer {

    static int[] buffer;
    static int size;
    static int index = 0;
    static int count = 0;

    CircularBuffer(int s) {
        size = s;
        buffer = new int[size];
    }

    void insert(int value) {
        buffer[index] = value;
        index = (index + 1) % size;
        if (count < size) count++;
    }

    void display() {
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(index + i) % size] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);

        System.out.print("Buffer: ");
        cb.display();
    }
}
