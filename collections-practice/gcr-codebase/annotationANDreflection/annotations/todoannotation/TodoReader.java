package com.bridgelabz.annotations.todoannotation;

import java.lang.reflect.Method;

public class TodoReader {

    public static void main(String[] args) {

        for (Method method : Project.class.getDeclaredMethods()) {
            Todo todo = method.getAnnotation(Todo.class);
            if (todo != null) {
                System.out.println(
                    todo.task() + " | " +
                    todo.assignedTo() + " | " +
                    todo.priority()
                );
            }
        }
    }
}

