package com.java8tutorial.methodrefs;

/**
 * Person value bean.
 */
public class Person {
    private String firstName, lastName;

    public Person() {}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
