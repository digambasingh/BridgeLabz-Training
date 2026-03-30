package EmployeeWageCalculation;

public class WageCalculation {

    public int calculateWage(int workingHours){
        return workingHours*CompanyPolicy.WAGE_PER_HOUR;
    }
}
