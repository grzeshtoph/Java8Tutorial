package com.java8tutorial.lambdas;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Test case for {@link com.java8tutorial.lambdas.SortList}
 */
public class SortListTest {
    private List<String> sortedList = Arrays.asList("xena", "peter", "mike", "anna");

    @Test
    public void sortOldTest() {
       assertListIsSorted(new SortList().sortOld());
    }

    @Test
    public void setLambda1Test() {
        assertListIsSorted(new SortList().sortLambda1());
    }

    @Test
    public void setLambda2Test() {
        assertListIsSorted(new SortList().sortLambda2());
    }

    @Test
    public void setLambda3Test() {
        assertListIsSorted(new SortList().sortLambda3());
    }

    @Test
    public void setLambda4Test() {
        assertListIsSorted(new SortList().sortLambda4());
    }

    private void assertListIsSorted(List<String> result) {
        assertEquals(sortedList.size(), result.size());
        for (int i = 0; i < sortedList.size(); i++) {
            assertEquals(sortedList.get(i), result.get(i));
        }
    }
}
