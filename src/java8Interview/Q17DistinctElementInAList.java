package java8Interview;

import java.util.Arrays;
import java.util.List;

public class Q17DistinctElementInAList {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,1,3,3,2,2,4,565,5,6,74,43,23);

        long count = integerList.stream().distinct().count();

        System.out.println(count);
    }
}