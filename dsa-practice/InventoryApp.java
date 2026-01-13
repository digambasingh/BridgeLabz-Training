package com.bridgelabz.dsa;

class ItemNode {
    int itemId;
    String itemName;
    int quantity;
    double price;
    ItemNode next;

    public ItemNode(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
class InventoryLinkedList {

    private ItemNode head;

    /* ---------------- ADD OPERATIONS ---------------- */

    // Add at beginning
    public void addAtBeginning(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        if (head == null) {
            head = newNode;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // Add at specific position (1-based index)
    public void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos <= 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }
        ItemNode newNode = new ItemNode(id, name, qty, price);
        ItemNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) return;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    /* ---------------- REMOVE ---------------- */

    public void removeByItemId(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }
        if (temp.next != null)
            temp.next = temp.next.next;
    }

    /* ---------------- UPDATE ---------------- */

    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    /* ---------------- SEARCH ---------------- */

    public ItemNode searchById(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public ItemNode searchByName(String name) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    /* ---------------- TOTAL VALUE ---------------- */

    public double calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        return total;
    }

    /* ---------------- DISPLAY ---------------- */

    public void display() {
        ItemNode temp = head;
        while (temp != null) {
            System.out.println(
                temp.itemId + " | " +
                temp.itemName + " | Qty: " +
                temp.quantity + " | Price: " +
                temp.price
            );
            temp = temp.next;
        }
    }

    /* ---------------- SORTING (MERGE SORT) ---------------- */

    public void sortByName(boolean ascending) {
        head = mergeSort(head, ascending, true);
    }

    public void sortByPrice(boolean ascending) {
        head = mergeSort(head, ascending, false);
    }

    private ItemNode mergeSort(ItemNode node, boolean asc, boolean sortByName) {
        if (node == null || node.next == null)
            return node;

        ItemNode middle = getMiddle(node);
        ItemNode nextOfMiddle = middle.next;
        middle.next = null;

        ItemNode left = mergeSort(node, asc, sortByName);
        ItemNode right = mergeSort(nextOfMiddle, asc, sortByName);

        return sortedMerge(left, right, asc, sortByName);
    }

    private ItemNode sortedMerge(ItemNode a, ItemNode b, boolean asc, boolean sortByName) {
        if (a == null) return b;
        if (b == null) return a;

        int compare;
        if (sortByName)
            compare = a.itemName.compareToIgnoreCase(b.itemName);
        else
            compare = Double.compare(a.price, b.price);

        ItemNode result;
        if ((asc && compare <= 0) || (!asc && compare > 0)) {
            result = a;
            result.next = sortedMerge(a.next, b, asc, sortByName);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next, asc, sortByName);
        }
        return result;
    }

    private ItemNode getMiddle(ItemNode head) {
        if (head == null) return head;
        ItemNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
public class InventoryApp {
    public static void main(String[] args) {

        InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addAtEnd(101, "Laptop", 5, 50000);
        inventory.addAtEnd(102, "Mouse", 20, 500);
        inventory.addAtBeginning(103, "Keyboard", 10, 1500);

        System.out.println("Inventory:");
        inventory.display();

        inventory.updateQuantity(102, 25);

        System.out.println("\nTotal Inventory Value: " + inventory.calculateTotalValue());

        System.out.println("\nSorted by Price (Ascending):");
        inventory.sortByPrice(true);
        inventory.display();

        System.out.println("\nSearch Result:");
        ItemNode item = inventory.searchByName("Laptop");
        if (item != null)
            System.out.println(item.itemName + " found!");
    }
}
