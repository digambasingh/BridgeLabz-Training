package com.bridgelabz.employeewage;

import java.util.Random;

// UC4: Calculate wages till total working hours = 100 OR max days = 20

public class EmployeeWageMaxInMonth {

    public static void main(String[] args) {

        final int EMP_WAGE_PER_HOUR = 20;
        final int MAX_WORKING_DAYS = 20;
        final int MAX_WORKING_HOURS = 100;
        final int PART_TIME_HOURS = 5;
        final int FULL_TIME_HOURS = 8;

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int dailyHours = 0;

        Random random = new Random();

        while (totalWorkingDays < MAX_WORKING_DAYS &&
               totalWorkingHours < MAX_WORKING_HOURS) {

            totalWorkingDays++;
            int empType = random.nextInt(3); // 0,1,2

            switch (empType) {
                case 1:
                    dailyHours = PART_TIME_HOURS;
                    break;

                case 2:
                    dailyHours = FULL_TIME_HOURS;
                    break;

                default:
                    dailyHours = 0; // Absent
            }

            totalWorkingHours += dailyHours;
        }

        int totalWage = totalWorkingHours * EMP_WAGE_PER_HOUR;

        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Monthly Wage: " + totalWage);
    }
}
