package com.bridgelabz.lambdaexpression;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeNameUppercase {
    public static void main(String[] args) {

        List<String> names = List.of("digambar", "rahul", "amit");

        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        upperNames.forEach(System.out::println);
    }
}

