package com.java8tutorial.defaultmethods;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InlineMultiplicationFormulaFactoryTest {
    @Test
    public void testValues() {
        Formula formula = new InlineMultiplicationFormulaFactory().createFormula();
        assertEquals(1900, formula.calculate(19), 0);
        assertEquals(22, formula.sqrt(484), 0);
    }
}
