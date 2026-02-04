package com.bridgelabz.lambdaexpression;

import java.util.*;
import java.util.function.Predicate;

public class NotificationFilter {
    public static void main(String[] args) {

        List<String> alerts = List.of(
                "Emergency Alert",
                "Appointment Reminder",
                "Health Tip",
                "Emergency ICU Update"
        );

        Predicate<String> emergencyOnly =
                alert -> alert.contains("Emergency");

        alerts.stream()
              .filter(emergencyOnly)
              .forEach(System.out::println);
    }
}

