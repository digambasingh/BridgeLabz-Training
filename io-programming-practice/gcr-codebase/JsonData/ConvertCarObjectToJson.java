package com.bridgelabz.JsonData;

public class ConvertCarObjectToJson {

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Camry", 2022);

        String json =
                "{\n" +
                "  \"brand\": \"" + car.brand + "\",\n" +
                "  \"model\": \"" + car.model + "\",\n" +
                "  \"year\": " + car.year + "\n" +
                "}";

        System.out.println(json);
    }
}

