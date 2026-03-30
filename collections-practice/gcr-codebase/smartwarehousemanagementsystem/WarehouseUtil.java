package com.bridgelabz.generics.smartwarehousemanagementsystem;

import java.util.List;

class WarehouseUtil {

    // Wildcard method
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getCategory() + " -> " + item.getName());
        }
    }
}
