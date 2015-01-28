package com.java8tutorial.lambdas;

import org.junit.Test;

import java.util.function.Predicate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Test for standard interface {@link java.util.function.Predicate}
 */
public class PredicatesTest {
    @Test
    public void notEmptyStringTest() {
        Predicate<String> notEmptyString = (s) -> s.length() > 0;
        assertTrue(notEmptyString.test("text"));
        assertFalse(notEmptyString.test(""));
        assertFalse(notEmptyString.negate().test("text"));
        assertTrue(notEmptyString.negate().test(""));
    }

    @Test
    public void combinedPredicates() {
        Predicate<String> isCapitalLetter = (s) -> s.startsWith(s.substring(0, 1).toUpperCase());
        Predicate<String> hasSpaces = (s) -> s.indexOf(' ') != -1;

        assertTrue(hasSpaces.test("with space"));
        assertFalse(hasSpaces.negate().test("with space"));
        assertTrue(isCapitalLetter.test("This is a proper sentence."));
        assertFalse(isCapitalLetter.test("lowecaseword"));
        assertTrue(isCapitalLetter.and(hasSpaces).test("This is a proper sentence."));
        assertFalse(isCapitalLetter.and(hasSpaces.negate()).test("This is a proper sentence."));
        assertTrue(isCapitalLetter.and(hasSpaces.negate()).test("Uppercaseword."));
    }
}
