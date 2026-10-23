
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @ParameterizedTest
    @EnumSource(
            value = DateChecker.Month.class,
            names = {
                    "FEBRUARY",
                    "APRIL",
                    "JUNE",
                    "SEPTEMBER",
                    "NOVEMBER"
            }
    )
    public void testMonthsWithout31Days(DateChecker.Month month) {
        assertFalse(
                dateChecker.has31Days(month),
                month + " should not have 31 days"
        );
    }

    @Test
    public void testNullMonthThrowsException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> dateChecker.has31Days(null)
        );
    }
}
