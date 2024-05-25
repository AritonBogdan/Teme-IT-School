import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class Tema28_29 {
    /**Tema-28-29✍️:
     -Using Java's built-in date/time libraries, generate a list of all Mondays in the upcoming year.
     Print out each Monday's date.*/

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Get the first day of the upcoming year
        LocalDate firstDayOfNextYear = currentDate.plusYears(1).withDayOfYear(1);

        // Create a list to store all Mondays
        List<LocalDate> mondays = new ArrayList<>();

        // Find the first Monday of the upcoming year
        LocalDate firstMonday = firstDayOfNextYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));

        // Add each Monday to the list until the end of the year
        LocalDate nextMonday = firstMonday;
        while (nextMonday.getYear() == firstDayOfNextYear.getYear()) {
            mondays.add(nextMonday);
            nextMonday = nextMonday.plusWeeks(1);
        }

        // Print all Mondays
        for (LocalDate monday : mondays) {
            System.out.println(monday);
        }
    }
}
