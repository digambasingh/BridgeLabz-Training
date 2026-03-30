package com.bridgelabz.annotations.jsonannotation;

public class User {

    @JsonField(name = "user_name")
    private String username;

    public User(String username) {
        this.username = username;
    }
}

