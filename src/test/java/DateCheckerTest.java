
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DateCheckerTest {

    DateChecker dateChecker = new DateChecker();

    @Test
    public void testJanuaryHas31Days() {
        boolean actual =
                dateChecker.has31Days(DateChecker.Month.JANUARY);

        assertTrue(actual, "January should have 31 days");
    }

    @Test
    public void testMarchHas31Days() {
        boolean actual =
                dateChecker.has31Days(DateChecker.Month.MARCH);

        assertTrue(actual, "March should have 31 days");
    }
}
