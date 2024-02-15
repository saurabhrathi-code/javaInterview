package java8Interview;

import java.util.Arrays;
import java.util.List;

public class Q16TotalElementInAList {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,3,1,2,3,6,7,8,9);

        long count = integerList.stream().count();
        System.out.println(count);
    }
}
