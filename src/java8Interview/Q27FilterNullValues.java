package java8Interview;

import java.util.stream.Stream;

//28. Java 8 – Filter a null value from a Stream
public class Q27FilterNullValues {
    public static void main(String[] args) {

        Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");

        language.filter(s-> s != null).forEach(System.out::println);
    }
}
