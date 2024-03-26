import java.sql.Timestamp;
import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Tema14 {
    public static void main(String[] args) {

/**1. Add 5 hours and 30 minutes to the current time and print it. */
        LocalDateTime oraLocala = LocalDateTime.now();
        LocalDateTime futureDateTime = oraLocala.plusHours(5).plusMinutes(30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Acum este ora " + oraLocala.format(formatter));
        System.out.println("Peste 5 ore si 30 de minute, ora va fi: " + futureDateTime.format(formatter));


/**2. From a given LocalDateTime, extract the date and time and print them separately. */
        LocalDateTime timpData = LocalDateTime.now();
        LocalDate date = timpData.toLocalDate();
        LocalTime time = timpData.toLocalTime();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedDate = date.format(dateFormatter);
        String formattedTime = time.format(timeFormatter);

        System.out.println("Data de azi este: " + formattedDate);
        System.out.println("Ora de acum este: " + formattedTime);


    }
}
