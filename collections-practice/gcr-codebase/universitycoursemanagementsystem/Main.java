package com.bridgelabz.generics.universitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Course<ExamCourse> math =
                new Course<>("Mathematics", new ExamCourse());

        Course<AssignmentCourse> softwareEng =
                new Course<>("Software Engineering", new AssignmentCourse());

        Course<ResearchCourse> aiResearch =
                new Course<>("AI Research", new ResearchCourse());

        // Collect only course TYPES using wildcard compatibility
        List<CourseType> courseTypes = new ArrayList<>();
        courseTypes.add(math.getCourseType());
        courseTypes.add(softwareEng.getCourseType());
        courseTypes.add(aiResearch.getCourseType());

        CourseUtil.displayCourses(courseTypes);
    }
}

