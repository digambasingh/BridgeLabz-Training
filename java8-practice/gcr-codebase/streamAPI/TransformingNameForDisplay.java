package com.bridgelabz.streamAPI;

	import java.util.*;

	public class TransformingNameForDisplay {
	    public static void main(String[] args) {
	        List<String> names = Arrays.asList("rahul", "amit", "zoya", "neha");

	        names.stream()
	                .map(String::toUpperCase)
	                .sorted()
	                .forEach(System.out::println);
	    }
	}
