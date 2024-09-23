package dsa_assignments_kunal.sept_20;
import java.util.logging.Logger;

public class DaysToGoOut {

    // Enum for months
    enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    private static final Logger logger = Logger.getLogger(DaysToGoOut.class.getName());

    public static void main(String[] args) {
        // Select the month of August
        Month currentMonth = Month.FEBRUARY;

        // Define the number of days in the selected month
        int numberOfDaysInMonth = getNumberOfDays(currentMonth);

        // Count the number of even days in the month
        int evenDaysCount = 0;
        for (int day = 1; day <= numberOfDaysInMonth; day++) {
            if (day % 2 == 0) {
                evenDaysCount++;
            }
        }

        // Log the result
        logger.info("Kunal can go out on " + evenDaysCount + " days in " + currentMonth);
    }

    // Method to get the number of days in a given month
    private static int getNumberOfDays(Month month) {
        switch (month) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                return 31;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                return 30;
            case FEBRUARY:
                return 28; // Not considering leap years for simplicity
            default:
                return 0;
        }
    }
}
