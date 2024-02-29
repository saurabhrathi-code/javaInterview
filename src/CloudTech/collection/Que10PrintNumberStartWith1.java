package CloudTech.collection;

import java.util.Arrays;
import java.util.List;

public class Que10PrintNumberStartWith1 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10,12,50,30,18,19);

        integerList.stream()
                .map(s-> s + "")
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);
    }
}
