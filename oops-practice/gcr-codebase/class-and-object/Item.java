package com.bridgelabz.classandobject;

class Item {
    String itemCode, itemName;
    double itemPrice;

    Item(String code, String name, double price) {
        itemCode = code;
        itemName = name;
        itemPrice = price;
    }

    void display() {
        System.out.println("itemCode : " + itemCode);
        System.out.println("itemPrice : " + itemPrice);
        System.out.println("itemName : " + itemName);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Item i1 = new Item("01AA", "Water bottle", 500.0);
        Item i2 = new Item("01BB", "Rice", 700.0);
        Item i3 = new Item("02AA", "blackboard", 400.0);

        i1.display();
        i2.display();
        i3.display();
    }
}
