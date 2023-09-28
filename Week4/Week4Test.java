import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        int test = Week4.max2Int(1, 2);
        int key = 2;
        assertEquals(test, key);
    }

    @Test
    public void testMax2Int2() {
        int test = Week4.max2Int(0, 1);
        int key = 1;
        assertEquals(test, key);
    }

    @Test
    public void testMax2Int3() {
        int test = Week4.max2Int(1001, 1000);
        int key = 1001;
        assertEquals(test, key);
    }

    @Test
    public void testMax2Int4() {
        int test = Week4.max2Int(1, 1);
        int key = 1;
        assertEquals(test, key);
    }

    @Test
    public void testMax2Int5() {
        int test = Week4.max2Int(5, 7);
        int key = 7;
        assertEquals(test, key);
    }

    @Test
    public void testMinArray1() {
        int[] arr = new int[]{1, 2};
        int test = Week4.minArray(arr);
        int key = 1;
        assertEquals(test, key);
    }

    @Test
    public void testMinArray2() {
        int[] arr = new int[]{0, 1};
        int test = Week4.minArray(arr);
        int key = 0;
        assertEquals(test, key);
    }

    @Test
    public void testMinArray3() {
        int[] arr = new int[]{1, 1, 2, 2, 3};
        int test = Week4.minArray(arr);
        int key = 1;
        assertEquals(test, key);
    }

    @Test
    public void testMinArray4() {
        int[] arr = new int[]{1, 0, 1};
        int test = Week4.minArray(arr);
        int key = 0;
        assertEquals(test, key);
    }

    @Test
    public void testMinArray5() {
        int[] arr = new int[]{0};
        int test = Week4.minArray(arr);
        int key = 0;
        assertEquals(test, key);
    }

    @Test
    public void testCalculateBMI1() {
        String test = Week4.calculateBMI(50, 1.75);
        String key = "Thiếu cân";
        assertEquals(test, key);
    }

    @Test
    public void testCalculateBMI2() {
        String test = Week4.calculateBMI(30, 1.75);
        String key = "Thiếu cân";
        assertEquals(test, key);
    }

    @Test
    public void testCalculateBMI3() {
        String test = Week4.calculateBMI(60, 1.74);
        String key = "Bình thường";
        assertEquals(test, key);
    }

    @Test
    public void testCalculateBMI4() {
        String test = Week4.calculateBMI(52, 1.62);
        String key = "Bình thường";
        assertEquals(test, key);
    }

    @Test
    public void testCalculateBMI5() {
        String test = Week4.calculateBMI(110, 1.70);
        String key = "Béo phì";
        assertEquals(test, key);
    }

}