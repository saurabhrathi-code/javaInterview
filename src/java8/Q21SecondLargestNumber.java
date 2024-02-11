package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Q21: Second largest no In an integer Array
public class Q21SecondLargestNumber {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Integer integer = integerList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("2nd Largest no:"+integer);
    }

}
