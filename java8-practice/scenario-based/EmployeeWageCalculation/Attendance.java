package EmployeeWageCalculation;
import java.util.*;
public class Attendance {
    Random random=new Random();

    public String getEmployeeType(){
        int val=random.nextInt(2);
        return switch (val) {
            case 0 -> "absent";
            case 1 -> "full-time";
            default -> "part-time";
        };
    }
}
