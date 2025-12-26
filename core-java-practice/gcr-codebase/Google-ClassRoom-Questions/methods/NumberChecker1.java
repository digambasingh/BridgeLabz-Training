package com.bridgelabz.methods;

public class NumberChecker1 {

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static boolean isDuck(int[] digits) {
        for (int d : digits)
            if (d != 0) return true;
        return false;
    }

    public static boolean isArmstrong(int num, int[] digits) {
        int sum = 0, power = digits.length;
        for (int d : digits)
            sum += Math.pow(d, power);
        return sum == num;
    }

    public static int[] largestSecondLargest(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max1) { max2 = max1; max1 = d; }
            else if (d > max2 && d != max1) max2 = d;
        }
        return new int[]{max1, max2};
    }

    public static int[] smallestSecondSmallest(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min1) { min2 = min1; min1 = d; }
            else if (d < min2 && d != min1) min2 = d;
        }
        return new int[]{min1, min2};
    }
}

