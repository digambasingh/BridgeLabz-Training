package com.bridgelabz.annotations.todoannotation;

public class Project {

    @Todo(task = "Add login", assignedTo = "Digambar")
    public void loginFeature() {}

    @Todo(task = "Improve UI", assignedTo = "Amit", priority = "HIGH")
    public void uiFeature() {}
}

