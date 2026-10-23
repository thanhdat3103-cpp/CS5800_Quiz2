
public class DateChecker {

    public enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public boolean has31Days(Month month) {
        if (month == null) {
            throw new IllegalArgumentException("Month cannot be null");
        }

        return switch (month) {
            case JANUARY, MARCH, MAY, JULY,
                 AUGUST, OCTOBER, DECEMBER -> true;

            case FEBRUARY -> false;

            case APRIL, JUNE, SEPTEMBER,
                 NOVEMBER -> false;
        };
    }
}
