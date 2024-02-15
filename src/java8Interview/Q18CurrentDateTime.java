package java8Interview;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q18CurrentDateTime {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String stringDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println(stringDateTime);

    }
}
