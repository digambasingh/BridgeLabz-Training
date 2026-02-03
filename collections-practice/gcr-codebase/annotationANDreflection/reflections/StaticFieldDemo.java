package com.bridgelabz.reflections;

import java.lang.reflect.Field;

public class StaticFieldDemo {

    public static void main(String[] args) throws Exception {

        Class<?> cls = Configuration.class;

        Field field = cls.getDeclaredField("API_KEY");
        field.setAccessible(true);

        field.set(null, "NEW_SECRET_KEY"); // null because static

        System.out.println("Updated API_KEY: " + field.get(null));
    }
}

