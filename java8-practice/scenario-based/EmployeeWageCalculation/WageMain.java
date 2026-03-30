package EmployeeWageCalculation;

public class WageMain {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Attendance attendanceService = new Attendance();
        WageCalculation wageCalculator = new WageCalculation();

        while (employee.getTotalWorkingDays() < CompanyPolicy.MAX_WORKING_DAYS &&
                employee.getTotalWorkingHours() < CompanyPolicy.MAX_WORKING_HOURS) {

            employee.addWorkingDay();

            String type = attendanceService.getEmployeeType();
            int workingHour = 0;

            switch (type) {
                case "full-time":
                    workingHour = CompanyPolicy.FULL_TIME_HOUR;
                    break;

                case "part-time":
                    workingHour = CompanyPolicy.PART_TIME_HOUR;
                    break;

                case "absent":
                    workingHour = 0;
                    break;
            }

            if (employee.getTotalWorkingHours() + workingHour >
                    CompanyPolicy.MAX_WORKING_HOURS)
                break;

            employee.addWorkingHour(workingHour);

            int dailyWage = wageCalculator.calculateWage(workingHour);
            employee.addWage(dailyWage);
        }

        System.out.println("Total Working Days: " + employee.getTotalWorkingDays());
        System.out.println("Total Working Hours: " + employee.getTotalWorkingHours());
        System.out.println("Total Wage: " + employee.getTotalWage());
    }
}
