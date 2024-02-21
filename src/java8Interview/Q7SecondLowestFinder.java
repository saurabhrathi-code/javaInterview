package java8Interview;

import java.util.Arrays;

//7. Write a program to Find the Second-Lowest Number.
public class Q7SecondLowestFinder {
    public static void main(String[] args) {

        int [] arr = {10,1,2,2,3,4,5,6,7,8,9,9,10,4};

        Integer integer = Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted()
                .skip(1)
                .findFirst()
                .get();

        System.out.println(integer);
    }
}
