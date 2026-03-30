package com.bridgelabz.JsonData;

	import com.fasterxml.jackson.dataformat.xml.XmlMapper;
	import com.fasterxml.jackson.databind.ObjectMapper;
	import java.io.File;
	import java.util.Map;

	public class ConvertJsonToXML {
	    public static void main(String[] args) throws Exception {

	        ObjectMapper jsonMapper = new ObjectMapper();
	        Map data = jsonMapper.readValue(new File("C:\\\\Users\\\\chand\\\\Downloads\\\\spring-jar-files\\\\Bridgelabz.io-programming\\\\src\\\\com\\\\bridgelabz\\\\JsonData\\\\\\\\user.json"), Map.class);

	        XmlMapper xmlMapper = new XmlMapper();
	        xmlMapper.writeValue(new File("C:\\\\\\\\Users\\\\\\\\chand\\\\\\\\Downloads\\\\\\\\spring-jar-files\\\\\\\\Bridgelabz.io-programming\\\\\\\\src\\\\\\\\com\\\\\\\\bridgelabz\\\\\\\\JsonData\\\\user.xml"), data);

	        System.out.println("Converted to XML");
	    }
	}

