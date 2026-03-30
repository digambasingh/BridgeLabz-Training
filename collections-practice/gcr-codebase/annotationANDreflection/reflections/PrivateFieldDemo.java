package com.bridgelabz.reflections;

import java.lang.reflect.Method;

public class PrivateMethodDemo {

    public static void main(String[] args) throws Exception {

        Calculator calc = new Calculator();

        Method method = Calculator.class
                .getDeclaredMethod("multiply", int.class, int.class);

        method.setAccessible(true);

        int result = (int) method.invoke(calc, 5, 4);
        System.out.println("Result: " + result);
    }
}

