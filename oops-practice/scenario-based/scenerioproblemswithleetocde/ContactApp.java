package com.scenario;

import java.util.*;

class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String msg) {
        super(msg);
    }
}
class Contact {
    String name;
    String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

class ContactManager {
    List<Contact> contacts = new ArrayList<>();

    public void addContact(String name, String phone) throws InvalidPhoneNumberException {
        if (!phone.matches("\\d{10}"))
            throw new InvalidPhoneNumberException("Phone number must be 10 digits");

        for (Contact c : contacts) {
            if (c.phone.equals(phone)) {
                System.out.println("Duplicate contact not allowed");
                return;
            }
        }
        contacts.add(new Contact(name, phone));
        System.out.println("Contact added");
    }

    public void searchContact(String name) {
        for (Contact c : contacts) {
            if (c.name.equalsIgnoreCase(name)) {
                System.out.println(c.name + " - " + c.phone);
                return;
            }
        }
        System.out.println("Contact not found");
    }

    public void deleteContact(String phone) {
        contacts.removeIf(c -> c.phone.equals(phone));
        System.out.println("Contact deleted if existed");
    }
}

public class ContactApp {
    public static void main(String[] args) {

        ContactManager manager = new ContactManager();

        try {
            manager.addContact("Rahul", "9876543210");
            manager.addContact("Amit", "9876543210"); // duplicate
            manager.addContact("Neha", "12345");      // invalid
        } catch (InvalidPhoneNumberException e) {
            System.out.println(e.getMessage());
        }

        manager.searchContact("Rahul");
        manager.deleteContact("9876543210");
    }
}

