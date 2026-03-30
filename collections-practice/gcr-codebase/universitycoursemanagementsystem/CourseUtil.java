package com.bridgelabz.generics.universitycoursemanagementsystem;

import java.util.List;

class CourseUtil {

    // Wildcard method to handle any course type
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(
                course.getType() + " | Evaluation: " + course.getEvaluationMethod()
            );
        }
    }
}
