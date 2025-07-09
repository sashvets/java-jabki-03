import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HomeWorkTest {
    @Test
    public void testSumRange() {
        Assertions.assertEquals(6, HomeWork.sumRange(1, 3));
        Assertions.assertEquals(6, HomeWork.sumRange(3, 1));
        Assertions.assertEquals(-5, HomeWork.sumRange(-3, 1));
        Assertions.assertEquals(-12, HomeWork.sumRange(-3, -5));
    }

    @Test
    public void testAddNum() {
        Assertions.assertEquals(4, HomeWork.add(1, 3));
        Assertions.assertEquals(0, HomeWork.add(-3, 3));
    }

    @Test
    public void testAddStr() {
        Assertions.assertEquals("СалютМарс", HomeWork.add("Салют", "Марс"));
        Assertions.assertEquals("Салют", HomeWork.add("Салют", null));
        Assertions.assertEquals("Марс", HomeWork.add(null, "Марс"));
    }

    @Test
    public void testFindMax() {
        Assertions.assertEquals(667, HomeWork.findMax(new int[]{-1, 4, 5, 6, 7, 667, 77}));
        Assertions.assertNull(HomeWork.findMax(new int[]{}));
    }

    @Test
    public void testGetFactorial() {
        Assertions.assertEquals(6, HomeWork.getFactorial(3));
        Assertions.assertNull(HomeWork.getFactorial(-5));
    }

    @Test
    public void testCalculateAreaCircle() {
        Assertions.assertEquals(Math.PI * Math.pow(4, 2), HomeWork.calculateArea(4));
    }

    @Test
    public void testCalculateAreaRectangle() {
        Assertions.assertEquals(25, HomeWork.calculateArea(5, 5));
    }

    @Test
    public void testArithmeticMean() {
        Assertions.assertEquals((double) (2 + 5 + 3) / 3, HomeWork.arithmeticMean(2, 5, 3));
    }

    @Test
    public void testGetHypotenuse() {
        Assertions.assertEquals(Math.sqrt(Math.pow(2, 2) + Math.pow(5, 2)), HomeWork.getHypotenuse(2, 5));
    }
}