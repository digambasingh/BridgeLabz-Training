package com.bridgelabz.dsa;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    Student data;
    ListNode next;

    public ListNode(Student data) {
        this.data = data;
        this.next = null;
    }
}


class StudentLinkedList {

    private ListNode head;

    // 1. Add at beginning
    public void addAtBeginning(Student student) {
        ListNode node = new ListNode(student);
        node.next = head;
        head = node;
    }

    // 2. Add at end
    public void addAtEnd(Student student) {
        ListNode node = new ListNode(student);
        if (head == null) {
            head = node;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    // 3. Add at specific position
    public void addAtPosition(Student student, int position) {
        if (position == 1) {
            addAtBeginning(student);
            return;
        }

        ListNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        ListNode node = new ListNode(student);
        node.next = temp.next;
        temp.next = node;
    }

    // 4. Delete by Roll Number
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data.getRollNumber() == rollNumber) {
            head = head.next;
            return;
        }

        ListNode temp = head;
        while (temp.next != null &&
                temp.next.data.getRollNumber() != rollNumber) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found");
        } else {
            temp.next = temp.next.next;
        }
    }

    // 5. Search by Roll Number
    public Student search(int rollNumber) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.data.getRollNumber() == rollNumber) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    // 6. Update grade
    public void updateGrade(int rollNumber, double newGrade) {
        Student student = search(rollNumber);
        if (student != null) {
            student.setGrade(newGrade);
        } else {
            System.out.println("Student not found");
        }
    }

    // 7. Display all students
    public void display() {
        if (head == null) {
            System.out.println("No student records found");
            return;
        }

        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}


class Student {
    private int rollNumber;
    private String name;
    private int age;
    private double grade;

    public Student(int rollNumber, String name, int age, double grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNumber +
                ", Name: " + name +
                ", Age: " + age +
                ", Grade: " + grade;
    }
}


public class StudentRecordManagement {
    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtEnd(new Student(12, "Digambar", 22, 95));
        list.addAtEnd(new Student(15, "Param", 25, 91));
        list.addAtBeginning(new Student(13, "Karan", 21, 96));

        list.display();

        System.out.println("\nUpdating Grade:");
        list.updateGrade(15, 99);
        list.display();

        System.out.println("\nDeleting Student:");
        list.deleteByRollNumber(12);
        list.display();

        System.out.println("\nSearching Student:");
        Student s = list.search(13);
        System.out.println(s != null ? s : "Student not found");
    }
}

