package com.bridgelabz.JsonData;

	import com.fasterxml.jackson.databind.ObjectMapper;
	import java.io.*;
	import java.util.*;

	public class ConvertCsvToJson {
	    public static void main(String[] args) throws Exception {

	        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\chand\\Downloads\\spring-jar-files\\Bridgelabz.io-programming\\src\\com\\bridgelabz\\JsonData\\\\data.csv"));
	        String header = br.readLine();
	        String[] keys = header.split(",");

	        List<Map<String, String>> list = new ArrayList<>();
	        String line;

	        while ((line = br.readLine()) != null) {
	            String[] values = line.split(",");
	            Map<String, String> map = new HashMap<>();

	            for (int i = 0; i < keys.length; i++) {
	                map.put(keys[i], values[i]);
	            }
	            list.add(map);
	        }

	        ObjectMapper mapper = new ObjectMapper();
	        mapper.writerWithDefaultPrettyPrinter()
	              .writeValue(new File("C:\\Users\\chand\\Downloads\\spring-jar-files\\Bridgelabz.io-programming\\src\\com\\bridgelabz\\JsonData\\\\data.json"), list);

	        br.close();
	    }
	}

