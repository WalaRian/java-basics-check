package at.tasks.date;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest {
    @Test
    void testDateTime() {
        String pattern = "dd/LLL/yyyy:HH:mm:ss X";
        String dateTime = "25/Jul/2022:06:25:35 +0300";
        LocalDateTime ldt = LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH));

        System.out.println(ldt);

    }
}
