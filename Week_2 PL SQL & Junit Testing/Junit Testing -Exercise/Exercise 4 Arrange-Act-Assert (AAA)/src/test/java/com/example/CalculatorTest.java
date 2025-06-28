package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calc;

  
    @BeforeEach
    void setUp() {
        System.out.println("Setting up...");
        calc = new Calculator();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up...");
        calc = null;
    }

    @Test
    void testAddition() {
    
        int result = calc.add(10, 5);
  
        assertEquals(15, result);
    }

    @Test
    void testSubtraction() {
        int result = calc.subtract(20, 8);
        assertEquals(12, result);
    }

    @Test
    void testDivision() {
        int result = calc.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.divide(10, 0);
        });
        assertEquals("/ by zero", exception.getMessage());
    }
}
