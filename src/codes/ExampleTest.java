package codes;

import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;

class ExampleTest {

    Example e = new Example();

    @Test
    void testGetHint() {
        assertEquals("1A3B", e.getHint("1807", "7810"));
        assertEquals("1A1B", e.getHint("1123", "0111"));
        assertEquals("1A0B", e.getHint("11", "10"));
    }

    @Test
    void testMaxProduct() {
        assertEquals(6, e.maxProduct(new int[] {2, 3, -2, 4}));
        assertEquals(0, e.maxProduct(new int[] {-2, 0, -1}));
    }

}
