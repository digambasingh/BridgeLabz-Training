package com.bridgelabz.classandobject;

class MobilePhone {
    String brand, model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Brand of mobile: " + brand);
        System.out.println("Model of mobile: " + model);
        System.out.println("Price of mobile: " + price);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        new MobilePhone("VIVO", "VIVO V29", 15999.0).display();
        new MobilePhone("ONE PLUS", "ONE PLUS nord4", 39999.0).display();
        new MobilePhone("APPLE", "iphone pro16", 79999.0).display();
    }
}

