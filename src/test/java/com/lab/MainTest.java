

package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void testAddition() {
        assertEquals(30, Main.add(10, 20));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(1, Main.add(-2, 3));
    }
}
