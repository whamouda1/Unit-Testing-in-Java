package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	private final MathUtils mathUtils = new MathUtils();

    @Test
    public void testAdd() {
        assertEquals(8, mathUtils.add(5, 3));
        assertEquals(-2, mathUtils.add(-5, 3));
        assertEquals(0, mathUtils.add(0, 0));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, mathUtils.subtract(5, 3));
        assertEquals(-8, mathUtils.subtract(-5, 3));
        assertEquals(0, mathUtils.subtract(0, 0));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, mathUtils.multiply(5, 3));
        assertEquals(-15, mathUtils.multiply(-5, 3));
        assertEquals(0, mathUtils.multiply(0, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, mathUtils.divide(5, 2), 0.001);
        assertEquals(-1.0, mathUtils.divide(5, 0)); // Division by zero
        assertEquals(0.0, mathUtils.divide(0, 5)); // 0 divided by any number
    }

    @Test
    public void testDivideNegative() {
        assertEquals(-2.5, mathUtils.divide(-5, 2), 0.001);
    }
}