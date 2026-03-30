package com.bridgelabz.lambdaexpression;

import java.util.*;

public class PatientIdPrinter {
    public static void main(String[] args) {

        List<Integer> patientIds = List.of(101, 102, 103, 104);

        // Method reference instead of lambda
        patientIds.forEach(System.out::println);
    }
}
