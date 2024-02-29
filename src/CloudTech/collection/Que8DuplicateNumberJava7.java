package CloudTech.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Que8DuplicateNumberJava7 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,20,30,30,40,50,50);

        Set<Integer> uniqueNumbers = new HashSet<>();

        for (Integer num: numbers) {
            if(!uniqueNumbers.add(num)) {
                System.out.println(num);
            }
        }
    }
}
