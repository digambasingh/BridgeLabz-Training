package com.collections;

import java.util.PriorityQueue;

class Patient implements Comparable<Patient> {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public int compareTo(Patient p) {
        return p.severity - this.severity; // Higher severity first
    }
}

public class HospitalTriage {
    public static void main(String[] args) {

        PriorityQueue<Patient> pq = new PriorityQueue<>();

        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));

        System.out.println("Treatment Order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll().name);
        }
    }
}
