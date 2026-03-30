package com.bridgelabz.JsonData;

	import com.fasterxml.jackson.databind.ObjectMapper;
	import java.io.File;
	import java.util.*;

	public class Jsonreport {
	    public static void main(String[] args) throws Exception {

	        Map<String, Object> report = new HashMap<>();
	        report.put("totalUsers", 3);
	        report.put("generatedOn", new Date());

	        ObjectMapper mapper = new ObjectMapper();
	        mapper.writerWithDefaultPrettyPrinter()
	              .writeValue(new File("C:\\Users\\chand\\Downloads\\spring-jar-files\\Bridgelabz.io-programming\\src\\com\\bridgelabz\\JsonData\\\\report.json"), report);
	    }
	}

