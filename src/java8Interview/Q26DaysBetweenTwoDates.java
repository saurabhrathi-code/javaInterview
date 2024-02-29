package java8Interview;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//27. Java 8 – How to calculate days between two dates?
public class Q26DaysBetweenTwoDates {

    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2024,2,10);
        LocalDate endDate = LocalDate.now();

        long between = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println(between);
    }

}
