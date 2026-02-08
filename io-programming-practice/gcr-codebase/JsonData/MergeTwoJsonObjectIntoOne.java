package com.bridgelabz.JsonData;

public class MergeTwoJsonObjectIntoOne {

    public static void main(String[] args) {

        String json1 = "{ \"name\": \"Digambar\", \"age\": 21 }";
        String json2 = "{ \"email\": \"digambar@gmail.com\", \"city\": \"Meerut\" }";

        // Remove closing brace from first JSON
        json1 = json1.substring(0, json1.length() - 1);

        // Remove opening brace from second JSON
        json2 = json2.substring(1);

        String mergedJson = json1 + "," + json2;

        System.out.println(mergedJson);
    }
}

