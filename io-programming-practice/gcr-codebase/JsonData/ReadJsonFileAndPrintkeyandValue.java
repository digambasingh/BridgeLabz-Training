package com.bridgelabz.JsonData;

	import com.fasterxml.jackson.databind.ObjectMapper;
	import java.io.File;
	import java.util.Map;

	public class ReadJsonFileAndPrintkeyandValue {
	    public static void main(String[] args) throws Exception {
	        ObjectMapper mapper = new ObjectMapper();

	        Map<?, ?> data = mapper.readValue(new File("C:\\Users\\chand\\Downloads\\spring-jar-files\\Bridgelabz.io-programming\\src\\com\\bridgelabz\\JsonData\\\\user.json"), Map.class);

	        for (Map.Entry<?, ?> entry : data.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }
	}
