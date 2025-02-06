package com.example; // replace with your actual package

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AdditionTest {
    @Test
    public void testAdd() {
        Addition addition = new Addition();
        assertEquals(5, addition.add(2, 3));
        assertEquals(0, addition.add(-1, 1));
        assertEquals(-1, addition.add(-2, 1));
        assertEquals(-2, addition.add(-2, 1));
    }
}