package java8Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q24ListIterationThroughOptional {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Apple", "Banana", "Grapes");

        Optional.ofNullable(stringList)
                .filter(s-> !s.isEmpty())
                .ifPresent(s -> s.forEach(System.out::println));
    }
}
