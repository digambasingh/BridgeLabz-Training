package com.bridgelabz.ioProgramming;

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Scanner;

	public class SearchEmployeeCSV {

	    public static void main(String[] args) {

	        String filePath = "C:\\\\Users\\\\chand\\\\Downloads\\\\spring-jar-files\\\\Bridgelabz.io-programming\\\\src\\\\com\\\\bridgelabz\\\\ioProgramming\\\\employees.csv";
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter employee name to search: ");
	        String searchName = sc.nextLine();

	        boolean found = false;

	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

	            // Skip header
	            br.readLine();

	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] data = line.split(",");

	                String name = data[1];

	                if (name.equalsIgnoreCase(searchName)) {
	                    String department = data[2];
	                    String salary = data[3];

	                    System.out.println("\nEmployee Found!");
	                    System.out.println("Name       : " + name);
	                    System.out.println("Department : " + department);
	                    System.out.println("Salary     : " + salary);
	                    found = true;
	                    break;
	                }
	            }

	            if (!found) {
	                System.out.println("\nEmployee not found.");
	            }

	        } catch (IOException e) {
	            System.out.println("Error reading the CSV file");
	            e.printStackTrace();
	        }

	        sc.close();
	    }
	}
