package com.bridgelabz.JsonData;

	import com.fasterxml.jackson.databind.ObjectMapper;
	import java.io.File;
	import java.util.*;

	public class MergeTwojsonFile {
	    public static void main(String[] args) throws Exception {

	        ObjectMapper mapper = new ObjectMapper();

	        Map map1 = mapper.readValue(new File("C:\\Users\\chand\\Downloads\\spring-jar-files\\Bridgelabz.io-programming\\src\\com\\bridgelabz\\JsonData\\\\object1.json"), Map.class);
	        Map map2 = mapper.readValue(new File("C:\\Users\\chand\\Downloads\\spring-jar-files\\Bridgelabz.io-programming\\src\\com\\bridgelabz\\JsonData\\\\object2.json"), Map.class);

	        map1.putAll(map2);

	        mapper.writerWithDefaultPrettyPrinter()
	              .writeValue(new File("C:\\Users\\chand\\Downloads\\spring-jar-files\\Bridgelabz.io-programming\\src\\com\\bridgelabz\\JsonData\\\\merged.json"), map1);

	        System.out.println("Merged!");
	    }
	}

