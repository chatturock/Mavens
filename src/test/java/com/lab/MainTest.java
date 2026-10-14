package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void testLargest() {
        int result = Main.largest(4, 12, 7);

        System.out.println("Largest of 4, 12, 7 = " + result);
        assertEquals(12, result);
    }

    @Test
    void testEqualValues() {
        int result = Main.largest(5, 5, 5);

        System.out.println("Largest of 5, 5, 5 = " + result);
        assertEquals(5, result);
    }
}


