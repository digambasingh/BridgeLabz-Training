package com.bridgelabz.annotations.repeatableAnnotation;

import java.lang.reflect.Method;

public class BugReader {

    public static void main(String[] args) throws Exception {

        Method method = BugTracker.class.getMethod("process");

        BugReport[] bugs = method.getAnnotationsByType(BugReport.class);

        for (BugReport bug : bugs) {
            System.out.println("Bug: " + bug.description());
        }
    }
}

