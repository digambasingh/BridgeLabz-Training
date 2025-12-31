package com.bridgelabz.classandobject;

class Employee {

    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    // Main method
    public static void main(String[] args) {

        Employee emp = new Employee("Rohan", 1, 500000);
        emp.displayDetails();
    }
}

