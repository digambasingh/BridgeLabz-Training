package com.Bridgelabz.j_unit;

//Problem:
//Create a Calculator class with methods add(int a, int b), subtract(int a, int b), multiply(int a, int b), and divide(int a, int b). Write JUnit test cases for each method.
// Bonus: Test for division by zero and handle exceptions properly.

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
}
