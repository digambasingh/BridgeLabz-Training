package com.bridgelabz.collectors;

import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
}

public class StudentResultByGrouping {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Amit", "A"),
                new Student("Ravi", "B"),
                new Student("Sita", "A"),
                new Student("Kiran", "C")
        );

        Map<String, List<String>> result =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getGrade,
                                Collectors.mapping(Student::getName, Collectors.toList())
                        ));

        System.out.println(result);
    }
}
