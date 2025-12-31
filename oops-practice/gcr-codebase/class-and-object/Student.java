package com.bridgelabz.classandobject;

class Student {
    String name, rollNumber;
    double m1, m2, m3;

    Student(String name, String roll, double m1, double m2, double m3) {
        this.name = name;
        this.rollNumber = roll;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    char calculateGrade() {
        double avg = (m1 + m2 + m3) / 3;
        if (avg >= 75) return 'B';
        else if (avg >= 60) return 'C';
        else return 'D';
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student RollNumber: " + rollNumber);
        System.out.println("Student Marks:");
        System.out.println("Mark1: " + m1);
        System.out.println("Mark2: " + m2);
        System.out.println("Mark3: " + m3);
        System.out.println("Grade " + calculateGrade());
    }

    public static void main(String[] args) {
        new Student("Thamarai", "ECE001", 80, 70, 75).display();
        new Student("Kannan", "CSC002", 60, 65, 50).display();
    }
}

