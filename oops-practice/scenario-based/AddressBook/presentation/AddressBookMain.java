package com.bridgelabz.presentation;

import com.bridgelabz.model.Contact;
import com.bridgelabz.service.AddressBookService;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program \n");

        AddressBookService service = new AddressBookService();

        // UC5
        service.createBook("Personal");

        // UC1–UC4
        Contact c1 = new Contact("Govind", "Upadhyay",
                "Street1", "Delhi", "Delhi",
                "110001", "9999", "govind@gmail.com");

        Contact c2 = new Contact("Amit", "Sharma",
                "Street2", "Mumbai", "MH",
                "400001", "8888", "amit@gmail.com");

        service.addContact("Personal", c1);
        service.addContact("Personal", c2);

        // UC6 duplicate
        service.addContact("Personal", c1);

        // UC11 sorting
        service.sortByName("Personal");
        service.showContacts("Personal").forEach(System.out::println);

        // UC8 search
        service.searchByCityOrState("Delhi");

        // UC10 count
        service.countByCityOrState("Delhi");

        // UC3 delete
        service.deleteContact("Personal", "Amit Sharma");

        // UC17 async operation
        service.asyncSave(() ->
                System.out.println("Saving data asynchronously...")
        );
    }
}
