package com.java8tutorial.methodrefs;

import com.java8tutorial.lambdas.Converter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Test case for {@link com.java8tutorial.methodrefs.ConverterFactory}.
 */
public class ConverterFactoryTest {
    private ConverterFactory factory = new ConverterFactory();

    @Test
    public void createStringToIntConverterTest() {
        Converter<String, Integer> converter = factory.createStringToIntConverter();
        assertEquals((Integer) 123, converter.convert("123"));
    }

    @Test
    public void createStringToBooleanConverterTest() {
        Converter<String, Boolean> converter = factory.createStringToBooleanConverter();
        assertEquals(true, converter.convert("true"));
    }

    @Test
    public void createStringAppendConverterTest() {
        Converter<String, String> converter = factory.createStringAppendConverter();
        assertEquals("ABCa test string", converter.convert("a test string"));
    }

    @Test
    public void createObjectAppendConverterTest() {
        Converter<Object, String> converter = factory.createObjectAppendConverter();
        assertTrue(converter.convert(new String[]{"a test string"}).startsWith("ABC[Ljava.lang.String;"));
    }
}
