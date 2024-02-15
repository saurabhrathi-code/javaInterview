package java8Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q15DuplicateCountInList {
    public static void main(String[] args) {

/*        List<String> stringList = Arrays.asList("Apple","Orange","Mango","Banana","Apple","Banana","Mango","Grapes");

        Map<String, Long> collect = stringList.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));*/

        List<Integer> integerList = Arrays.asList(1,3,4,5,5,6,7,7,8,9,9,12,43,5,6);

        Map<Integer, Long> collect = integerList.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

        System.out.println(collect);
    }
}
