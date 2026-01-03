package com.scenario;

class MathUtility {

    // Factorial
    public static long factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Factorial not defined for negative numbers.");

        long result = 1;
        for (int i = 2; i <= n; i++)
            result *= i;

        return result;
    }

    // Prime Check
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // GCD (Euclidean Algorithm)
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Fibonacci
    public static long fibonacci(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Fibonacci not defined for negative numbers.");

        if (n == 0) return 0;
        if (n == 1) return 1;

        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}


public class MathUtilityTest {
    public static void main(String[] args) {

        // Factorial
        System.out.println("Factorial(5): " + MathUtility.factorial(5));
        System.out.println("Factorial(0): " + MathUtility.factorial(0));

        // Prime Check
        System.out.println("Is 7 prime? " + MathUtility.isPrime(7));
        System.out.println("Is 1 prime? " + MathUtility.isPrime(1));

        // GCD
        System.out.println("GCD(48, 18): " + MathUtility.gcd(48, 18));
        System.out.println("GCD(-12, 6): " + MathUtility.gcd(-12, 6));

        // Fibonacci
        System.out.println("Fibonacci(10): " + MathUtility.fibonacci(10));
        System.out.println("Fibonacci(0): " + MathUtility.fibonacci(0));
    }
}
