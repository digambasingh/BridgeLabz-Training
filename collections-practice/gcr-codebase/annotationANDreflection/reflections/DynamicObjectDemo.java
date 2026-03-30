package com.bridgelabz.reflections;

public class DynamicObjectDemo {

    public static void main(String[] args) throws Exception {

        Class<?> cls = Class.forName("Student");

        Object obj = cls.getDeclaredConstructor().newInstance();

        Student student = (Student) obj;
        student.show();
    }
}

