package com.java8tutorial.methodrefs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link com.java8tutorial.methodrefs.PersonFactory}
 */
public class PersonFactoryTest {
    @Test
    public void createTest() {
        PersonFactory<Person> factory = Person::new;
        Person person = factory.create("Peter", "Parker");
        assertEquals("Peter", person.getFirstName());
        assertEquals("Parker", person.getLastName());
    }
}
