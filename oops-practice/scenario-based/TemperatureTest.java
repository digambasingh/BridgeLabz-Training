package com.scenario;

class TemperatureAnalyzer {

    // Find average temperature for each day
    public static float[] averagePerDay(float[][] temps) {
        float[] averages = new float[7];

        for (int day = 0; day < 7; day++) {
            float sum = 0;
            for (int hour = 0; hour < 24; hour++) {
                sum += temps[day][hour];
            }
            averages[day] = sum / 24;
        }
        return averages;
    }

    // Find hottest day
    public static int hottestDay(float[][] temps) {
        int hottestDay = 0;
        float maxTemp = temps[0][0];

        for (int day = 0; day < 7; day++) {
            for (int hour = 0; hour < 24; hour++) {
                if (temps[day][hour] > maxTemp) {
                    maxTemp = temps[day][hour];
                    hottestDay = day;
                }
            }
        }
        return hottestDay;
    }

    // Find coldest day
    public static int coldestDay(float[][] temps) {
        int coldestDay = 0;
        float minTemp = temps[0][0];

        for (int day = 0; day < 7; day++) {
            for (int hour = 0; hour < 24; hour++) {
                if (temps[day][hour] < minTemp) {
                    minTemp = temps[day][hour];
                    coldestDay = day;
                }
            }
        }
        return coldestDay;
    }
}


public class TemperatureTest {
    public static void main(String[] args) {

        float[][] temperatures = new float[7][24];

        // Sample data
        for (int d = 0; d < 7; d++) {
            for (int h = 0; h < 24; h++) {
                temperatures[d][h] = 20 + d; // simple dummy values
            }
        }

        float[] averages = TemperatureAnalyzer.averagePerDay(temperatures);

        for (int i = 0; i < averages.length; i++) {
            System.out.println("Day " + (i + 1) + " Average: " + averages[i]);
        }

        System.out.println("Hottest Day: Day " +
                (TemperatureAnalyzer.hottestDay(temperatures) + 1));
        System.out.println("Coldest Day: Day " +
                (TemperatureAnalyzer.coldestDay(temperatures) + 1));
    }
}

