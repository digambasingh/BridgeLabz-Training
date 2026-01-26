package com.streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerializationDemo {

    private static final String FILE_NAME = "employees.dat";

    public static void main(String[] args) {

        // Create employee list
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Digambar", "IT", 60000));
        employees.add(new Employee(102, "Aman", "HR", 45000));
        employees.add(new Employee(103, "Riya", "Finance", 55000));

        // Serialize
        serializeEmployees(employees);

        // Deserialize
        deserializeEmployees();
    }

    // Serialize employee list
    private static void serializeEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            oos.writeObject(employees);
            System.out.println("Employees saved successfully.");

        } catch (IOException e) {
            System.out.println("Error during serialization.");
        }
    }

    // Deserialize employee list
    private static void deserializeEmployees() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            List<Employee> employees =
                    (List<Employee>) ois.readObject();

            System.out.println("\nRetrieved Employee Data:");
            for (Employee emp : employees) {
                emp.display();
            }

        } catch (IOException e) {
            System.out.println("Error during deserialization.");
        } catch (ClassNotFoundException e) {
            System.out.println("Employee class not found.");
        }
    }
}

