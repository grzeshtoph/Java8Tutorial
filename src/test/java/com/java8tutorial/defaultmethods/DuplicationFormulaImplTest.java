package com.java8tutorial.defaultmethods;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicationFormulaImplTest {
    @Test
    public void testValues() {
        Formula formula = new DuplicationFormulaImpl();
        assertEquals(200, formula.calculate(100), 0);
        assertEquals(10, formula.sqrt(100), 0);
    }
}
