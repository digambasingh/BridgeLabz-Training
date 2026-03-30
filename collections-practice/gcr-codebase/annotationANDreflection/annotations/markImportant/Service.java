package com.bridgelabz.annotations.markImportant;

public class Service {

    @ImportantMethod
    public void saveData() {}

    @ImportantMethod(level = "LOW")
    public void logData() {}
}

