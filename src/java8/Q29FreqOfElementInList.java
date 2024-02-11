package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q29FreqOfElementInList {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Saurabh", "Anannya", "Rajat","Nidhi","Adi","Arav","Sam","Rajat", "Sam",
                "Nidhi");

        Map<String, Long> collect = stringList.stream().collect(Collectors.groupingBy(s->s, Collectors.counting()));

        collect.forEach((key,value) -> System.out.println("key:"+key+" value:"+value));
    }
}
