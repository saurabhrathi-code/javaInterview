package java8Interview;

import java.util.Arrays;
import java.util.OptionalInt;

public class Q5MinMaxFinder {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9};

        OptionalInt min = Arrays.stream(arr).min();
        System.out.println(min);

        int max = Arrays.stream(arr).max().orElseThrow();
        System.out.println(max);
    }
}
