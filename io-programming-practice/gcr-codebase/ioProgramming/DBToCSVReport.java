package com.bridgelabz.ioProgramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.FileWriter;
import java.io.IOException;

public class DBToCSVReport {

    // Update DB credentials
    private static final String DB_URL = "jdbc:mysql://localhost:3306/companydb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "7088323289Digambar@123";

    public static void main(String[] args) {

        String csvFile = "C:\\\\Users\\\\chand\\\\Downloads\\\\spring-jar-files\\\\Bridgelabz.io-programming\\\\src\\\\com\\\\bridgelabz\\\\ioProgramming\\\\employees_report.csv";
        String query = "SELECT emp_id, name, department, salary FROM employees";

        try (
            Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            FileWriter writer = new FileWriter(csvFile)
        ) {

            // Write CSV header
            writer.append("Employee ID,Name,Department,Salary\n");

            // Write data rows
            while (rs.next()) {
                writer.append(rs.getInt("emp_id") + ",")
                      .append(rs.getString("name") + ",")
                      .append(rs.getString("department") + ",")
                      .append(rs.getDouble("salary") + "\n");
            }

            System.out.println("CSV report generated successfully!");

        } catch (Exception e) {
            System.out.println("Error generating CSV report");
            e.printStackTrace();
        }
    }
}
