package com.java8tutorial.predefinedfuncs;

import com.java8tutorial.methodrefs.Person;
import org.junit.Test;

import java.util.function.Supplier;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

/**
 * Test for standard Suppliers
 */
public class SuppliersTest {
    @Test
    public void personSupplyTest() {
        Supplier<Person> personSupplier = Person::new;
        assertNotNull(personSupplier.get());
        assertNotSame(personSupplier.get(), personSupplier.get());
    }
}
