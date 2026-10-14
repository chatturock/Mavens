
package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void testAddition1() {
        int a = 2;
        int b = 3;
        int result = Main.add(a, b);

        System.out.println(a + " + " + b + " = " + result);

        assertEquals(5, result);
    }

    @Test
    void testAddition2() {
        int a = 3;
        int b = 4;
        int result = Main.add(a, b);

        System.out.println(a + " + " + b + " = " + result);

        assertEquals(7, result);
    }
}
