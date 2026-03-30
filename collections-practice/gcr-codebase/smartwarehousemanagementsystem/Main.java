package com.bridgelabz.generics.smartwarehousemanagementsystem;

public class Main {
    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Mobile"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice"));
        groceryStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));

        System.out.println("Electronics Storage:");
        WarehouseUtil.displayItems(electronicsStorage.getItems());

        System.out.println("Groceries Storage:");
        WarehouseUtil.displayItems(groceryStorage.getItems());

        System.out.println("Furniture Storage:");
        WarehouseUtil.displayItems(furnitureStorage.getItems());
    }
}

