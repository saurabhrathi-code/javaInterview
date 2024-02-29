package CloudTech.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Que9DuplicateNumberJava8 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,20,30,30,40,50,50);

        Set<Integer> uniqueNumbers = new HashSet<>();

        numbers.stream().filter(n-> !uniqueNumbers.add(n)).forEach(System.out::println);
    }
}
