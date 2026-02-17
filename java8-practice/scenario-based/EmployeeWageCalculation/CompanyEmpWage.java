package EmployeeWageCalculation;

import java.util.*;
public class CompanyEmpWage {
	static Attendance attendanceService = new Attendance();
    static WageCalculation wageCalculator = new WageCalculation();
	
	String companyName;
	List<Employee> employees;
	
	CompanyEmpWage(String name){
		this.companyName = name;
		employees = new ArrayList<>();
	}
	
	void addEmployee() {
		Employee e =new Employee();
		inititalizeEmployee(e);
		employees.add(e);
	}
	
	void inititalizeEmployee(Employee e) {
		while(e.getTotalWorkingDays()<CompanyPolicy.MAX_WORKING_DAYS &&
				e.getTotalWorkingHours()<CompanyPolicy.MAX_WORKING_HOURS) {
			
			String type = attendanceService.getEmployeeType();
			
			int hours = 0;
			
			switch (type) {
				case "part-time": {
					hours=CompanyPolicy.PART_TIME_HOUR;
					return;
				}
				case "full-time": {
					hours=CompanyPolicy.PART_TIME_HOUR;
					return;
				}
			}
			
			if(e.getTotalWorkingHours()+hours > CompanyPolicy.MAX_WORKING_HOURS) {
				break;
			}
			e.addWorkingHour(hours);
			e.addWage(hours*CompanyPolicy.WAGE_PER_HOUR);
			e.addWorkingDay();
		}
	}
}
