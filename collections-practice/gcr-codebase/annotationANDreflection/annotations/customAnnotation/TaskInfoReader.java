package com.bridgelabz.annotations.customAnnotation;

import java.lang.reflect.Method;

public class TaskInfoReader {

    public static void main(String[] args) throws Exception {

        Method method = TaskManager.class.getMethod("completeTask");

        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

        System.out.println("Priority: " + taskInfo.priority());
        System.out.println("Assigned To: " + taskInfo.assignedTo());
    }
}

