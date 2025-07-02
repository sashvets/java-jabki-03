import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeWorkTest {
    // 1.
    @Test
    public void sumRangetest() {
        Assertions.assertEquals(6, HomeWork.sumRange(1, 3));
        Assertions.assertEquals(6, HomeWork.sumRange(3, 1));
        Assertions.assertEquals(-5, HomeWork.sumRange(-3, 1));
    }

    // 2.
    @Test
    public void addNumTest() {
        Assertions.assertEquals(4, HomeWork.add(1, 3));
        Assertions.assertEquals(0, HomeWork.add(-3, 3));
    }

    @Test
    public void addStrTest() {
        Assertions.assertEquals("СалютМарс", HomeWork.add("Салют", "Марс"));
        Assertions.assertEquals("Салют", HomeWork.add("Салют", null));
        Assertions.assertEquals("Марс", HomeWork.add(null, "Марс"));
    }

    // 3.
    @Test
    public void findMaxTest() {
        Assertions.assertEquals(667, HomeWork.findMax(new int[]{-1, 4, 5, 6, 7, 667, 77}));
        Assertions.assertNull(HomeWork.findMax(new int[]{}));
    }

    // 4.
    @Test
    public void factorialTest() {
        Assertions.assertEquals(6, HomeWork.factorial(3));
        Assertions.assertNull(HomeWork.factorial(-5));
    }

    // 5.
    @Test
    public void calculateAreaCircleTest() {
        Assertions.assertEquals(Math.PI * Math.pow(4, 2), HomeWork.calculateArea(4));
    }

    @Test
    public void calculateAreaRectangleTest() {
        Assertions.assertEquals(25, HomeWork.calculateArea(5, 5));
    }

    // 6.
    @Test
    public void arithmeticMeanTest() {
        Assertions.assertEquals((double) (2 + 5 + 3) / 3, HomeWork.arithmeticMean(2, 5, 3));
    }

    // 7.
    @Test
    public void hypotenuseTest() {
        Assertions.assertEquals(Math.sqrt(Math.pow(2, 2) + Math.pow(5, 2)), HomeWork.hypotenuse(2, 5));
    }
}