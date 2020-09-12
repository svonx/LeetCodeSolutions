package codes;

import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;

class ExampleTest {

    Example e = new Example();

    @Test
    void testCompareVersion() {
        assertEquals(0, e.compareVersion("1.01", "1.001"));
        assertEquals(0, e.compareVersion("1.0", "1.0.0"));
        assertEquals(-1, e.compareVersion("0.1", "1.1"));
        assertEquals(1, e.compareVersion("1.0.1", "1"));
        assertEquals(-1, e.compareVersion("7.5.2.4", "7.5.3"));
        assertEquals(-1, e.compareVersion("1.0.10", "1.0.100.1"));
        assertEquals(1, e.compareVersion("2.3.39", "2.3.38.99"));
        assertEquals(0, e.compareVersion("1.3.5.00", "1.3.5.0.00.0.000"));
    }

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

    @Test
    void  testFindMedianSortedArray() {
        assertEquals(2.0000, e.findMedianSortedArrays(new int[] {1, 3},
                new int[] {2}), .00004);
        assertEquals(2.5000, e.findMedianSortedArrays(new int[] {1, 3},
                new int[] {2, 4}), .00004);
        assertEquals(0.0000, e.findMedianSortedArrays(new int[] {0, 0, 0},
                new int[] {0, 0, 0, 0}), .0004);
        assertEquals(1.0000 ,e.findMedianSortedArrays(new int[] {},
                new int[] {1}), .0004);
        assertEquals(4.5, e.findMedianSortedArrays(new int[] {1, 2, 3, 4},
                new int[] {5, 6, 7, 8}), .0004);
        assertEquals(3, e.findMedianSortedArrays(new int[] {1},
                new int[] {2, 3, 4, 5}), .0004);
    }

}
