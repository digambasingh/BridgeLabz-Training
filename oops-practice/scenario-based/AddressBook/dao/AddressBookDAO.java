package com.bridgelabz.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bridgelabz.model.AddressBook;
import com.bridgelabz.model.Contact;

public class AddressBookDAO {

    private Map<String, AddressBook> books = new HashMap<>();

    public void addAddressBook(String name) {
        books.putIfAbsent(name, new AddressBook(name));
    }

    public boolean addContact(String book, Contact contact) {
        AddressBook ab = books.get(book);
        if (ab.getContacts().contains(contact)) return false;
        ab.getContacts().add(contact);
        return true;
    }

    public boolean deleteContact(String book, String name) {
        return books.get(book).getContacts()
                .removeIf(c -> c.getFullName().equalsIgnoreCase(name));
    }

    public List<Contact> getContacts(String book) {
        return books.get(book).getContacts();
    }

    // UC8 + UC9
    public List<Contact> searchByCityOrState(String value) {
        List<Contact> result = new ArrayList<>();
        books.values().forEach(ab ->
            ab.getContacts().forEach(c -> {
                if (c.getCity().equalsIgnoreCase(value) ||
                    c.getState().equalsIgnoreCase(value)) {
                    result.add(c);
                }
            })
        );
        return result;
    }
}
