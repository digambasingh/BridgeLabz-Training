package com.bridgelabz.streamAPI;

import java.util.*;

class Doctor {
    String name;
    String specialty;
    boolean weekendAvailable;

    Doctor(String name, String specialty, boolean weekendAvailable) {
        this.name = name;
        this.specialty = specialty;
        this.weekendAvailable = weekendAvailable;
    }
}

public class HospitalDoctorAvailable {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr Rahul Kumar", "Cardiology", true),
                new Doctor("Dr Ritesh Kumar", "Neurology", false),
                new Doctor("Dr Ganesh Kumar", "Dermatology", true)
        );

        doctors.stream()
                .filter(d -> d.weekendAvailable)
                .sorted(Comparator.comparing(d -> d.specialty))
                .forEach(d -> System.out.println(d.name));
    }
}
