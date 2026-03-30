package com.bridgelabz.JsonData;

	import com.fasterxml.jackson.databind.ObjectMapper;
	import java.io.File;
	import java.util.*;

	class User {
	    public String name;
	    public int age;
	    public String email;
	}

	public class JsonAndFilter {
	    public static void main(String[] args) throws Exception {
	        ObjectMapper mapper = new ObjectMapper();

	        User[] users = mapper.readValue(new File("C:\\Users\\chand\\Downloads\\spring-jar-files\\Bridgelabz.io-programming\\src\\com\\bridgelabz\\JsonData\\\\users.json"), User[].class);

	        for (User u : users) {
	            if (u.age > 25) {
	                System.out.println(u.name + " " + u.age);
	            }
	        }
	    }
	}

