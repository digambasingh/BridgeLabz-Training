package com.bridgelabz.JsonData;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class ConvertListToJsonArray {

    public static void main(String[] args) throws Exception {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", "Camry", 2022));
        cars.add(new Car("Honda", "Civic", 2021));
        cars.add(new Car("Hyundai", "i20", 2023));

        ObjectMapper mapper = new ObjectMapper();

        String jsonArray =
                mapper.writerWithDefaultPrettyPrinter()
                      .writeValueAsString(cars);

        System.out.println(jsonArray);
    }
}

