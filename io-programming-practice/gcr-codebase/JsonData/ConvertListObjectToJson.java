package com.bridgelabz.JsonData;

	import com.fasterxml.jackson.databind.ObjectMapper;
	import java.util.*;

	class Cars {
	    public String brand;
	    public String model;

	    public Cars(String b, String m) {
	        brand = b;
	        model = m;
	    }
	}

	public class ConvertListObjectToJson {
	    public static void main(String[] args) throws Exception {
	        List<Cars> cars = Arrays.asList(
	                new Cars("Toyota", "Camry"),
	                new Cars("Honda", "Civic")
	        );

	        ObjectMapper mapper = new ObjectMapper();
	        System.out.println(
	                mapper.writerWithDefaultPrettyPrinter()
	                        .writeValueAsString(cars)
	        );
	    }
	}

