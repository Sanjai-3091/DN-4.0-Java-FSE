package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class AssertionsTest {

    @Test
    public void testVariousAssertions() {
        // Assert equals with strings
        assertEquals("Strings should match", "JUnit", "JUnit");

        // Assert not equals
        assertNotEquals("Values should not be equal", 10, 5);

        // Assert same (reference equality)
        String a = "test";
        String b = a;
        assertSame("Should reference same object", a, b);

        // Assert not same
        String x = new String("test");
        String y = new String("test");
        assertNotSame("Different object references", x, y);

        // Assert array equality
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals("Arrays should be equal", expected, actual);

        // Assert list contents
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        assertTrue("List should contain 'Bob'", names.contains("Bob"));

        // Assert string contains
        String sentence = "JUnit makes testing easy";
        assertTrue("Sentence should contain 'testing'", sentence.contains("testing"));

        // Assert with custom error message
        assertTrue("Number should be positive", 10 > 0);

        // Edge case: checking zero division handling
        int result = divide(10, 2);
        assertEquals("Division should be correct", 5, result);

        // Negative test: expect exception
        try {
            divide(10, 0);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            assertEquals("/ by zero", e.getMessage());
        }
    }

    public int divide(int a, int b) {
        return a / b;
    }
}