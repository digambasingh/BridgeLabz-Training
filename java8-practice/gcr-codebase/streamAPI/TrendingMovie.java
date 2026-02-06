package com.bridgelabz.streamAPI;

	import java.util.*;

	class Movie {
	    String name;
	    double rating;
	    int year;

	    Movie(String name, double rating, int year) {
	        this.name = name;
	        this.rating = rating;
	        this.year = year;
	    }
	}

	public class TrendingMovie {
	    public static void main(String[] args) {
	        List<Movie> movies = Arrays.asList(
	                new Movie("A", 8.5, 2022),
	                new Movie("B", 9.0, 2023),
	                new Movie("C", 7.5, 2021),
	                new Movie("D", 8.8, 2023),
	                new Movie("E", 9.2, 2024),
	                new Movie("F", 8.0, 2020)
	        );

	        movies.stream()
	                .filter(m -> m.rating > 8)
	                .sorted(Comparator.comparing((Movie m) -> m.rating).reversed()
	                        .thenComparing(m -> m.year, Comparator.reverseOrder()))
	                .limit(5)
	                .forEach(m -> System.out.println(m.name));
	    }
	}

