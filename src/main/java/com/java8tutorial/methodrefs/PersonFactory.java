package com.java8tutorial.methodrefs;

/**
 * Factory interface for persons
 */
@FunctionalInterface
public interface PersonFactory<P extends Person> {
    Person create(String firstName, String lastName);
}
