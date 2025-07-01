import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    public void hello() {
        String name = "Котик";
        Assertions.assertEquals("Hello " + name, Main.hello(name));
    }

    @Test
    public void multiply() {
        int a = 2;
        int b = 3;
        Assertions.assertEquals(a * b, Main.multiply(a, b));
    }

    @Test
    public void factorial() {
        int a = 3;
        int b = 6;
        Assertions.assertEquals(b, Main.factorial(a));
    }

}