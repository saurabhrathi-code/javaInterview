package java8;

//Find even numbers from ArrayList and find the sum of all numbers using Java 8 stream API

import java.util.Arrays;
import java.util.List;

public class FindEvenAndSum {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int sumOfEvenNo = myList.stream()
                .filter(x-> x%2 == 0)
                .mapToInt(Integer::intValue) //it will convert Integer(non-primitive) to int(primitive)
                .sum();
        System.out.println(sumOfEvenNo);
    }
}
