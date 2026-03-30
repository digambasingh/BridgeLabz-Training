package com.bridgelabz.annotations.customAnnotation;

public class TaskManager {

    @TaskInfo(priority = "HIGH", assignedTo = "Digambar")
    public void completeTask() {
        System.out.println("Task completed");
    }
}
