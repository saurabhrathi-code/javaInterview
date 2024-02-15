package java8Interview;

import java.util.Arrays;
import java.util.List;

public class Q21UpperCaseConversion {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("apple", "ball", "cat", "dog");

        stringList.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
