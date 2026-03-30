package com.bridgelabz.annotations.repeatableAnnotation;

public class BugTracker {

    @BugReport(description = "NullPointerException issue")
    @BugReport(description = "Performance issue")
    public void process() {
        System.out.println("Processing...");
    }
}

