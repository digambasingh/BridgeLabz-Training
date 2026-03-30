package com.bridgelabz.generics.universitycoursemanagementsystem;

class ResearchCourse extends CourseType {

    public ResearchCourse() {
        super("Research Work");
    }

    @Override
    public String getType() {
        return "Research-Based Course";
    }
}
