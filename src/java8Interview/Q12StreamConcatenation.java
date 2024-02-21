package java8Interview;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//13. Write a Java 8 program to concatenate two Streams?
public class Q12StreamConcatenation {
    public static void main(String[] args) {

        Stream<String> stringStream1 = Stream.of("sam","adi","tom");
        Stream<String> stringStream2 = Stream.of("Nick","Jhon","Jack");

        List<String> collect = Stream.concat(stringStream1, stringStream2).collect(Collectors.toList());
        System.out.println(collect);
    }
}
