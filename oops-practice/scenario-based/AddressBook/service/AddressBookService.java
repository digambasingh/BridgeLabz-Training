package com.bridgelabz.service;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.bridgelabz.dao.AddressBookDAO;
import com.bridgelabz.model.Contact;

public class AddressBookService {

    private AddressBookDAO dao = new AddressBookDAO();
    private ExecutorService executor = Executors.newSingleThreadExecutor();

    // UC5
    public void createBook(String name) {
        dao.addAddressBook(name);
    }

    // UC2 + UC6
    public void addContact(String book, Contact contact) {
        if (!dao.addContact(book, contact))
            System.out.println("Duplicate contact not allowed \n");
    }

    // UC3
    public void deleteContact(String book, String name) {
        if (!dao.deleteContact(book, name))
            System.out.println("Contact not found");
        else System.out.println("\nDeleted the contact with name " + name);
    }

    // UC4
    public List<Contact> showContacts(String book) {
    	System.out.println("Showing all contacts-");
        return dao.getContacts(book);
    }

    // UC8
    public void searchByCityOrState(String value) {
    	System.out.println("\nSearching by the city " + value);
        dao.searchByCityOrState(value)
           .forEach(System.out::println);
    }

    // UC10
    public void countByCityOrState(String value) {
        System.out.println(
            dao.searchByCityOrState(value).size()
        );
    }

    // UC11
    public void sortByName(String book) {
        dao.getContacts(book).sort(
            Comparator.comparing(Contact::getFullName)
        );
    }

    // UC12
    public void sortByCity(String book) {
        dao.getContacts(book).sort(
            Comparator.comparing(Contact::getCity)
        );
    }

    // UC17 (Multithreading)
    public void asyncSave(Runnable task) {
        executor.submit(task);
    }
}
