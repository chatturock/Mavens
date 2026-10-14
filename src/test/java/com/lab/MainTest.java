package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void testFactorial() {
        long result = Main.factorial(5);

        System.out.println("Factorial of 5 = " + result);
        assertEquals(120L, result);
    }

    @Test
    void testZeroFactorial() {
        long result = Main.factorial(0);

        System.out.println("Factorial of 0 = " + result);
        assertEquals(1L, result);
    }
}
