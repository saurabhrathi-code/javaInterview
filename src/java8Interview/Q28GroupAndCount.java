package java8Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//29.Group by a List and display the total count of it in ascending order
//List<String> items =
//               Arrays.asList("apple", "apple", "banana",
//                       "apple", "orange", "banana", "papaya");
public class Q28GroupAndCount {
    public static void main(String[] args) {

        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");


        Map<String, Long> collect = items.stream().sorted()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.println(collect);

        collect.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey()+":"+entry.getValue()));

    }
}

//entrySet method : returns a set view of the entries in the collect
//Map.Entry : is used to access key-value pair within the map
