package com.bridgelabz.generics.universitycoursemanagementsystem;

abstract class CourseType {

    private final String evaluationMethod;

    public CourseType(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
    }

    public String getEvaluationMethod() {
        return evaluationMethod;
    }

    public abstract String getType();
}
