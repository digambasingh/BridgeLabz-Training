package com.bridgelabz.generics.universitycoursemanagementsystem;

class Course<T extends CourseType> {

    private final String courseName;
    private final T courseType;

    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public String getCourseName() {
        return courseName;
    }

    public T getCourseType() {
        return courseType;
    }
}

