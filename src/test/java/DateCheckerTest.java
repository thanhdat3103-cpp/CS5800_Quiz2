
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

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

    @ParameterizedTest
    @EnumSource(
            value = DateChecker.Month.class,
            names = {
                    "JANUARY",
                    "MARCH",
                    "MAY",
                    "JULY",
                    "AUGUST",
                    "OCTOBER",
                    "DECEMBER"
            }
    )
    public void testMonthsWith31Days(DateChecker.Month month) {
        assertTrue(
                dateChecker.has31Days(month),
                month + " should have 31 days"
        );
    }
}
