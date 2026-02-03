package com.bridgelabz.reflections;

public class JsonTest {

    public static void main(String[] args) throws Exception {

        User user = new User();
        System.out.println(JsonUtil.toJson(user));
    }
}

