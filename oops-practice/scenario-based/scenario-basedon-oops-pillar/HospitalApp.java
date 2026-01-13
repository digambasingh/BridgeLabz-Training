package com.bridgelabz.scenario;

import java.util.*;

//custom exception
class AppointmentNotAvailableException extends Exception {
 public AppointmentNotAvailableException(String message) {
     super(message);
 }
}

//abstract service
interface HospitalService {
 void bookAppointment(Patient patient, Doctor doctor)
         throws AppointmentNotAvailableException;

 void cancelAppointment(int appointmentId);
}

//base class
class Person {
 int id;
 String name;

 Person(int id, String name) {
     this.id = id;
     this.name = name;
 }
}

//Patient class
class Patient extends Person {
 List<String> medicalHistory;

 Patient(int id, String name) {
     super(id, name);
     medicalHistory = new ArrayList<>();
 }

 void addMedicalRecord(String record) {
     medicalHistory.add(record);
 }

 void showMedicalHistory() {
     System.out.println("Medical History of " + name + ": " + medicalHistory);
 }
}

//Doctor class
class Doctor extends Person {
 String specialization;
 boolean available;

 Doctor(int id, String name, String specialization) {
     super(id, name);
     this.specialization = specialization;
     this.available = true;
 }

 double calculateFee() {
     return 500;
 }
}

//Specialist doctor (polymorphism)
class SpecialistDoctor extends Doctor {

 SpecialistDoctor(int id, String name, String specialization) {
     super(id, name, specialization);
 }

 @Override
 double calculateFee() {
     return 1000;
 }
}

//Appointment class
class Appointment {
 int appointmentId;
 Patient patient;
 Doctor doctor;

 Appointment(int appointmentId, Patient patient, Doctor doctor) {
     this.appointmentId = appointmentId;
     this.patient = patient;
     this.doctor = doctor;
 }
}

//hospital implementation
class Hospital implements HospitalService {

 private List<Appointment> appointments;
 private int appointmentCounter = 1;

 Hospital() {
     appointments = new ArrayList<>();
 }

 public void bookAppointment(Patient patient, Doctor doctor)
         throws AppointmentNotAvailableException {

     if (!doctor.available) {
         throw new AppointmentNotAvailableException("Doctor not available");
     }

     Appointment ap = new Appointment(appointmentCounter++, patient, doctor);
     appointments.add(ap);
     doctor.available = false;

     System.out.println("Appointment booked with Dr. " + doctor.name);
     System.out.println("Consultation Fee: ₹" + doctor.calculateFee());
 }

 public void cancelAppointment(int appointmentId) {
     Iterator<Appointment> it = appointments.iterator();
     while (it.hasNext()) {
         Appointment ap = it.next();
         if (ap.appointmentId == appointmentId) {
             ap.doctor.available = true;
             it.remove();
             System.out.println("Appointment cancelled");
             return;
         }
     }
     System.out.println("Appointment not found");
 }

 void showAppointments() {
     System.out.println("---- Appointments ----");
     for (Appointment ap : appointments) {
         System.out.println("ID: " + ap.appointmentId +
                 " Patient: " + ap.patient.name +
                 " Doctor: " + ap.doctor.name);
     }
 }
}

//main class
public class HospitalApp {
 public static void main(String[] args) {

     Hospital hospital = new Hospital();

     Patient p1 = new Patient(1, "Rahul");
     p1.addMedicalRecord("Fever");
     p1.addMedicalRecord("Blood Test");

     Doctor d1 = new Doctor(101, "Sharma", "General");
     Doctor d2 = new SpecialistDoctor(102, "Mehta", "Cardiology");

     try {
         hospital.bookAppointment(p1, d1);
         hospital.bookAppointment(p1, d2); // exception
     } catch (AppointmentNotAvailableException e) {
         System.out.println(e.getMessage());
     }

     hospital.showAppointments();
     p1.showMedicalHistory();

     hospital.cancelAppointment(1);
     hospital.showAppointments();
 }
}

