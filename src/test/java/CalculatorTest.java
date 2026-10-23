import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int expected = 3;
        int actual = calculator.sum(1, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testSumWithNegativeNumbers() {
        int expected = -2;
        int actual = calculator.sum(-5, 3);

        assertEquals(expected, actual);
    }

    @Test
    public void testSumWithZero() {
        int expected = 0;
        int actual = calculator.sum(0, 0);

        assertEquals(expected, actual);
    }


    @Test
    public void testSubtract() {
        int expected = -1;
        int actual = calculator.subtract(1, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubtractWithPositiveResult() {
        int expected = 7;
        int actual = calculator.subtract(10, 3);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubtractWithNegativeNumbers() {
        int expected = 2;
        int actual = calculator.subtract(-3, -5);

        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 12;
        int actual = calculator.multiply(3, 4);

        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyWithNegativeNumber() {
        int expected = -12;
        int actual = calculator.multiply(-3, 4);

        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyWithZero() {
        int expected = 0;
        int actual = calculator.multiply(8, 0);

        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        int expected = 3;
        int actual = calculator.divide(7, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testDivideByZero() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(10, 0)
        );

        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    public void testIsEven() {
        boolean actual = calculator.isEven(2);

        assertTrue(actual);
    }
}
