package com.bridgelabz.model;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private String name;
    private List<Contact> contacts = new ArrayList<>();

    public AddressBook(String name) {
        this.name = name;
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}
	