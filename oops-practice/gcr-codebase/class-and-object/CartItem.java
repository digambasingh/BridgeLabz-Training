package com.bridgelabz.classandobject;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String item, double price, int qty) {
        this.itemName = item;
        this.price = price;
        this.quantity = qty;
    }

    void addItem(int qty) {
        quantity += qty;
        System.out.println("Added " + qty + " of " + itemName + " to the cart.");
    }

    void removeItem(int qty) {
        quantity -= qty;
        System.out.println("Removed " + qty + " of " + itemName + " from the cart.");
    }

    void totalCost() {
        System.out.println("Total cost: $" + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem c = new CartItem("Laptop", 999.99, 1);
        System.out.println("Item: Laptop, Price: $999.99, Quantity: 1");
        c.addItem(2);
        c.removeItem(1);
        c.totalCost();
    }
}
