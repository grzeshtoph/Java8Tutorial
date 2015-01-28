package com.java8tutorial.lambdas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test cases for {@link com.java8tutorial.lambdas.Converter}
 */
public class ConverterTest {
    @Test
    public void fromStringToIntTest() {
        Converter<String, Integer> converter = (input) -> Integer.valueOf(input);
        assertConverter(converter, "123", 123);
    }

    @Test(expected = NumberFormatException.class)
    public void fromStringToIntErrorTest() {
        Converter<String, Integer> converter = (input) -> Integer.valueOf(input);
        assertConverter(converter, "a text", null);
    }

    @Test
    public void fromStringToBooleanTest() {
        Converter<String, Boolean> converter = (input) -> Boolean.valueOf(input);
        assertConverter(converter, "true", true);
        assertConverter(converter, "True", true);
        assertConverter(converter, "TRue", true);
        assertConverter(converter, "TRUE", true);
        assertConverter(converter, "false", false);
        assertConverter(converter, "FalsE", false);
        assertConverter(converter, "something", false);
    }

    @Test
    public void appenderTest() {
        Converter<String, String> converter = (input) -> input + " and this is the added text";
        assertConverter(converter, "", " and this is the added text");
        assertConverter(converter, "something", "something and this is the added text");
    }

    private void assertConverter(Converter converter, Object actual, Object expected) {
        assertEquals(expected, converter.convert(actual));
    }
}
