package com.bridgelabz.annotations.jsonannotation;

import java.lang.reflect.Field;

public class JsonSerializer {

    public static String toJson(Object obj) throws Exception {
        StringBuilder json = new StringBuilder("{");

        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            JsonField jf = field.getAnnotation(JsonField.class);

            if (jf != null) {
                json.append("\"")
                    .append(jf.name())
                    .append("\":\"")
                    .append(field.get(obj))
                    .append("\",");
            }
        }
        json.deleteCharAt(json.length() - 1);
        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws Exception {
        User user = new User("Digambar");
        System.out.println(toJson(user));
    }
}
