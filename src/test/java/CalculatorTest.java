
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
