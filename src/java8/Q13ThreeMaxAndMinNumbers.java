package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


//Q13: Three max and min numbers form the list
public class Q13ThreeMaxAndMinNumbers {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(13,54,3,4,86,6,7,8,9,10);

        System.out.println("Min 3 Numbers:");

        numberList.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("Max 3 Numbers:");

        numberList.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);
    }
}
