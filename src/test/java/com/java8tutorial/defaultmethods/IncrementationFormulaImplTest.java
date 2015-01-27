package com.java8tutorial.defaultmethods;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IncrementationFormulaImplTest {
    @Test
    public void testValues() {
        Formula formula = new IncrementationFormulaImpl();
        assertEquals(101, formula.calculate(100), 0);
        assertEquals(102, formula.sqrt(101), 0);
    }
}
