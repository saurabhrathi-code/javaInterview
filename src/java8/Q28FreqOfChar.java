package java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q28FreqOfChar {
    public static void main(String[] args) {

        String inputString = "Saurabh";

        Map<Character, Long> collect = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collect.forEach((key,value) -> System.out.println("key:"+key+" value:"+value));
    }
}
