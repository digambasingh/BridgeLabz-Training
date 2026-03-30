package com.bridgelabz.reflections;

import java.lang.reflect.Field;

public class JsonUtil {

    public static String toJson(Object obj) throws Exception {

        StringBuilder json = new StringBuilder("{");
        Class<?> cls = obj.getClass();

        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            json.append("\"")
                .append(field.getName())
                .append("\":\"")
                .append(field.get(obj))
                .append("\",");
        }

        json.deleteCharAt(json.length() - 1); // remove last comma
        json.append("}");
        return json.toString();
    }
}

