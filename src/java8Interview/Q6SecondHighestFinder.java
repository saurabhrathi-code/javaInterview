package java8Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

public class Q6SecondHighestFinder {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9};

        int first = Arrays.stream(arr)
                .boxed()// convert primitive int to stream<Integer>
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(Integer.MAX_VALUE);
                //.orElseThrow();

        System.out.println(first);
    }
}
