package java8;

import java.util.Arrays;
import java.util.List;
//Q26: Given a list of strings, find out those strings which start with a number?
public class Q26FindStringStartWithNumber {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("1Saurabh", "Anannya", "2Rajat","Nidhi","Adi","Arav","3Sam");

        stringList.stream().filter(str->Character.isDigit(str.charAt(0))).forEach(System.out::println);

    }
}
