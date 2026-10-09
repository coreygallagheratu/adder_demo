package com.example.adder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdderTest {

    @Test
    void addTwoPositiveNumbers() {
        assertEquals(8, Adder.add(3, 5));
    }

    @Test
    void addPositiveAndNegativeNumbers() {
        assertEquals(2, Adder.add(5, -3));
    }

    @Test
    void addTwoNegativeNumbers() {
        assertEquals(-8, Adder.add(-3, -5));
    }

    @Test
    void addZero() {
        assertEquals(5, Adder.add(5, 0));
    }

    @Test
    void securityTestWithIntegerBoundaryValues() {
        assertEquals(-1, Adder.add(Integer.MAX_VALUE, 1));
        assertEquals(0, Adder.add(Integer.MIN_VALUE, 0));
    }
}
