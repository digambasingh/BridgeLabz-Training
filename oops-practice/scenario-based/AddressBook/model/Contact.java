package com.bridgelabz.model;

import java.util.Objects;

public class Contact {
    private String firstName, lastName;
    private String address, city, state, zip;
    private String phone, email;

    public Contact(String firstName, String lastName, String address,
                   String city, String state, String zip,
                   String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getAddress() { return address; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZip() { return zip; }

    // UC7 Duplicate Check
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact c = (Contact) o;
        return firstName.equalsIgnoreCase(c.firstName)
                && lastName.equalsIgnoreCase(c.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName.toLowerCase(), lastName.toLowerCase());
    }

    @Override
    public String toString() {
        return getFullName() + ", " + city + ", " + state +
                ", " + zip + ", " + phone + ", " + email;
    }
}
