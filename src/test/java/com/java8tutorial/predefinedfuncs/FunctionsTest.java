package com.java8tutorial.predefinedfuncs;

import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.assertEquals;

/**
 * Test cases for {@link java.util.function.Function}
 */
public class FunctionsTest {
    @Test
    public void toIntegerFunctionTest() {
        Function<String, Integer> toInteger = getToIntegerFunction();
        assertEquals(Integer.valueOf(123), toInteger.apply("123"));
        assertEquals(Integer.valueOf(-345), toInteger.apply("-345"));
    }

    @Test(expected = NumberFormatException.class)
    public void toIntegerFaultyTest() {
        getToIntegerFunction().apply("test");
    }

    @Test
    public void getAppendToNumericTest() {
        assertEquals("123 and appendix", getAppendToNumeric().apply("123"));
        assertEquals("-12 and appendix", getAppendToNumeric().apply("-12"));
    }

    @Test(expected = NumberFormatException.class)
    public void getAppendToNumericFaultyTest() {
        getAppendToNumeric().apply("test");
    }

    private Function<String, String> getAppendToNumeric() {
        return getToIntegerFunction().andThen(String::valueOf).andThen((s) -> s + " and appendix");
    }

    private Function<String, Integer> getToIntegerFunction() {
        return Integer::valueOf;
    }
}
