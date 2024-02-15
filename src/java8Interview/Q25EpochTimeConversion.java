package java8Interview;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Q25EpochTimeConversion {
    public static void main(String[] args) {
        long epochTimeMilliseconds = System.currentTimeMillis();

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
