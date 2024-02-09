package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q9ListToMap {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Sai", "Nihal","Aditya");

        Map<Integer, String> stringMap = list.stream().collect(Collectors.toMap(x -> list.indexOf(x), x -> x));

        System.out.println(stringMap);

       // stringMap.forEach((key,value) -> System.out.println(key+ "->" + value));
    }
}
