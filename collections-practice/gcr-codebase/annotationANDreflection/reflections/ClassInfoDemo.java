package com.bridgelabz.reflections;

import java.lang.reflect.*;
import java.util.Scanner;

public class ClassInfoDemo {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter class name: ");
        String className = sc.nextLine();

        Class<?> cls = Class.forName(className);

        System.out.println("\n--- Methods ---");
        for (Method m : cls.getDeclaredMethods()) {
            System.out.println(m.getName());
        }

        System.out.println("\n--- Fields ---");
        for (Field f : cls.getDeclaredFields()) {
            System.out.println(f.getName());
        }

        System.out.println("\n--- Constructors ---");
        for (Constructor<?> c : cls.getDeclaredConstructors()) {
            System.out.println(c);
        }
    }
}
