package com.bridgelabz.annotations.markImportant;

import java.lang.reflect.Method;

public class ImportantMethodReader {

    public static void main(String[] args) {

        for (Method method : Service.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = method.getAnnotation(ImportantMethod.class);
                System.out.println(method.getName() + " - Level: " + im.level());
            }
        }
    }
}

