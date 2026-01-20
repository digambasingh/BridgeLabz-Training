package com.bridgelabz.cenimatime;

import java.util.ArrayList;
import java.util.List;


public class CinemaTime {

 private List<String> movieTitles = new ArrayList<>();
 private List<String> showTimes = new ArrayList<>();

 // Add Movie
 public void addMovie(String title, String time) throws InvalidTimeFormatException {
     if (!isValidTime(time)) {
         throw new InvalidTimeFormatException("Invalid time format: " + time);
     }
     movieTitles.add(title);
     showTimes.add(time);
 }

 // Search Movie
 public void searchMovie(String keyword) {
     boolean found = false;
     try {
         for (int i = 0; i < movieTitles.size(); i++) {
             if (movieTitles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                 System.out.println(
                     String.format("%s at %s", movieTitles.get(i), showTimes.get(i))
                 );
                 found = true;
             }
         }
         if (!found) {
             System.out.println("No movie found with keyword: " + keyword);
         }
     } catch (IndexOutOfBoundsException e) {
         System.out.println("Error while searching movies.");
     }
 }

 // Display All Movies
 public void displayAllMovies() {
     System.out.println("Movie Schedule:");
     for (int i = 0; i < movieTitles.size(); i++) {
         System.out.println(movieTitles.get(i) + " - " + showTimes.get(i));
     }
 }

 // Convert List to Array (Printable Report)
 public void generateReport() {
     String[] titleArray = movieTitles.toArray(new String[0]);
     String[] timeArray = showTimes.toArray(new String[0]);

     System.out.println("\n🧾 Printable Report:");
     for (int i = 0; i < titleArray.length; i++) {
         System.out.println(titleArray[i] + " | " + timeArray[i]);
     }
 }

 // Time Validation
 private boolean isValidTime(String time) {
     try {
         String[] parts = time.split(":");
         int hour = Integer.parseInt(parts[0]);
         int min = Integer.parseInt(parts[1]);
         return hour >= 0 && hour <= 23 && min >= 0 && min <= 59;
     } catch (Exception e) {
         return false;
     }
 }

 // Main Method
 public static void main(String[] args) {
     CinemaTime cinema = new CinemaTime();

     try {
         cinema.addMovie("Inception", "18:30");
         cinema.addMovie("Interstellar", "21:00");
         cinema.addMovie("Avatar", "25:99"); // Invalid
     } catch (InvalidTimeFormatException e) {
         System.out.println(e.getMessage());
     }

     cinema.displayAllMovies();
     cinema.searchMovie("inter");
     cinema.generateReport();
 }
}
