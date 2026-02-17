package EmployeeWageCalculation;

public class Employee {
    private int totalWorkingHours;
    private int totalWorkingDays;
    private int totalWage;

    public void addWorkingHour(int hours){
        totalWorkingHours+=hours;
    }

    public void addWorkingDay(){
        totalWorkingDays++;
    }

    public void addWage(int wage){
        totalWage+=wage;
    }

    public int getTotalWorkingHours() {
        return totalWorkingHours;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public int getTotalWage() {
        return totalWage;
    }
}
