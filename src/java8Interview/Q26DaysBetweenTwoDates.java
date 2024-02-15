package java8Interview;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Q26DaysBetweenTwoDates {

    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2024,2,10);
        LocalDate endDate = LocalDate.now();

        long between = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println(between);
    }

}
