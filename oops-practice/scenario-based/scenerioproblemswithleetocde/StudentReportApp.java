package com.scenario;

import java.util.*;

class InvalidMarkException extends Exception {
    public InvalidMarkException(String msg) {
        super(msg);
    }
}

class Student {
    String name;
    int[] marks;

    public Student(String name, int[] marks) throws InvalidMarkException {
        for (int m : marks) {
            if (m < 0 || m > 100)
                throw new InvalidMarkException("Marks must be 0–100");
        }
        this.name = name;
        this.marks = marks;
    }

    public double average() {
        int sum = 0;
        for (int m : marks) sum += m;
        return sum / (double) marks.length;
    }

    public String grade() {
        double avg = average();
        if (avg >= 80) return "A";
        if (avg >= 60) return "B";
        return "C";
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Average: " + average());
        System.out.println("Grade: " + grade());
        System.out.println("-----------------");
    }
}

public class StudentReportApp {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        try {
            students.add(new Student("Ravi", new int[]{80, 90, 85}));
            students.add(new Student("Amit", new int[]{60, 70, 65}));
            students.add(new Student("Neha", new int[]{110, 90, 80})); // invalid
        } catch (InvalidMarkException e) {
            System.out.println(e.getMessage());
        }

        for (Student s : students) {
            s.display();
        }
    }
}
