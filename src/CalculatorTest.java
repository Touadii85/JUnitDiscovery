import junit.framework.TestCase;
import org.junit.*;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest extends TestCase {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testAdd() {
        calculator = new Calculator();
        Assert.assertEquals("Error in add method", 5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        calculator = new Calculator();
        Assert.assertEquals("Error in subtract method", -1, calculator.soustract(2, 3));
    }

    @Test
    public void testMultiply() {
        calculator = new Calculator();
        Assert.assertEquals("Error in multiply method", 6, calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() throws Exception {
        calculator = new Calculator();
        Assert.assertEquals("Error in divide method", 2.0, calculator.divided(6, 3), 0.0001);
    }

    @Test
    public void testDivideByZero() {
        calculator = new Calculator();
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            calculator.divided(5, 0);
        });

        Assertions.assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}

