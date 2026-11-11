package com.example.maven_github_demo;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class odd_even_test {

    odd_even obj = new odd_even();

    @Test
    public void testEvenNumber() {
        assertEquals("Even", obj.checkEvenOdd(10));
    }

    @Test
    public void testOddNumber() {
        assertEquals("Odd", obj.checkEvenOdd(7));
    }

    @Test
    public void testZero() {
        assertEquals("Even", obj.checkEvenOdd(0));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals("Odd", obj.checkEvenOdd(-3));
    }
}
