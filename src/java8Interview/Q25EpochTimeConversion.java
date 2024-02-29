package java8Interview;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

//26. Java 8 – Convert Epoch time milliseconds to LocalDate or LocalDateTime
public class Q25EpochTimeConversion {
    public static void main(String[] args) {
        long epochTimeMilliseconds = System.currentTimeMillis();
        System.out.println(epochTimeMilliseconds);

        LocalDate localDate = Instant.ofEpochMilli(epochTimeMilliseconds)
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        System.out.println(localDate);

        LocalDateTime localDateTime = Instant.ofEpochMilli(epochTimeMilliseconds)
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
        System.out.println(localDateTime);
    }
}
