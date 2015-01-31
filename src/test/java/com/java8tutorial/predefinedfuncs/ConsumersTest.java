package com.java8tutorial.predefinedfuncs;

import com.java8tutorial.methodrefs.Person;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Test case for Consumer.
 */
public class ConsumersTest {
    private static final Logger LOG = LoggerFactory.getLogger(ConsumersTest.class);
    @Test
    public void personConsumerTest() {
        Supplier<Person> personSupplier = () -> new Person("Adam", "Smith");
        Consumer<Person> personGreeter = (p) -> LOG.info("Hello " + p.getFirstName() + " " + p.getLastName());
        Consumer<Person> personFarreweller = (p) -> LOG.info("Goodbye " + p.getFirstName() + " " + p.getLastName());

        personGreeter.andThen(personFarreweller).accept(personSupplier.get());
    }
}
