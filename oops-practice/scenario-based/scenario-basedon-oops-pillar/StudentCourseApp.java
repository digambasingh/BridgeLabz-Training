package com.bridgelabz.scenario;

import java.util.*;

//custom exception
class CourseLimitExceededException extends Exception {
 public CourseLimitExceededException(String message) {
     super(message);
 }
}

//abstract class
abstract class RegistrationService {
 abstract void enrollCourse(String course) throws CourseLimitExceededException;
 abstract void dropCourse(String course);
}

//base class
class Person {
 protected int id;
 protected String name;

 Person(int id, String name) {
     this.id = id;
     this.name = name;
 }
}

//Student class
class Student extends Person {

 private List<String> courses;
 private Map<String, String> grades;
 private final int MAX_COURSES = 3;

 Student(int id, String name) {
     super(id, name);
     courses = new ArrayList<>();
     grades = new HashMap<>();
 }

 public List<String> getCourses() {
     return courses;
 }

 public String getGrade(String course) {
     return grades.get(course);
 }

 void assignGrade(String course, String grade) {
     grades.put(course, grade);
 }
}

//service class
class StudentRegistration extends RegistrationService {

 private Student student;

 StudentRegistration(Student student) {
     this.student = student;
 }

 public void enrollCourse(String course) throws CourseLimitExceededException {
     if (student.getCourses().size() >= 3) {
         throw new CourseLimitExceededException("Maximum course limit reached");
     }
     student.getCourses().add(course);
     System.out.println("Enrolled in: " + course);
 }

 public void dropCourse(String course) {
     if (student.getCourses().remove(course)) {
         System.out.println("Dropped course: " + course);
     } else {
         System.out.println("Course not found");
     }
 }

 void showCourses() {
     System.out.println("Registered Courses: " + student.getCourses());
 }
}

//main class
public class StudentCourseApp {
 public static void main(String[] args) {

     Student s1 = new Student(101, "Digambar");
     StudentRegistration service = new StudentRegistration(s1);

     try {
         service.enrollCourse("Java");
         service.enrollCourse("DBMS");
         service.enrollCourse("DSA");
         service.enrollCourse("OS"); // exception here
     } catch (CourseLimitExceededException e) {
         System.out.println(e.getMessage());
     }

     service.showCourses();

     s1.assignGrade("Java", "A");
     s1.assignGrade("DBMS", "B+");

     System.out.println("Grade in Java: " + s1.getGrade("Java"));

     service.dropCourse("DBMS");
     service.showCourses();
 }
}
