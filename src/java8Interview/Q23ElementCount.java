package java8Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//24. How to count each element/word from the String ArrayList in Java8?
//List<String> names = Arrays.asList("AA", "BB", "AA", "CC");

public class Q23ElementCount {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");

        Map<Object, Long> count = names.stream().collect(Collectors.groupingBy(word->word,Collectors.counting()));

        //count.forEach((k,v)->System.out.println(k+":"+v));

        System.out.println(count);
    }
}
