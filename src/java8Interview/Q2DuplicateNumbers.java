package java8Interview;

import java.util.*;
//2. Write a program to print duplicate numbers.
public class Q2DuplicateNumbers {
    public static void main(String[] args) {
        Integer[] numberArray = {1,1,1,1,2,3,4,5,5,4,3,2,1,7,9,8,0};

        List<Integer> integerList = Arrays.asList(numberArray);

        Set<Integer> integerSet = new HashSet<>();

        integerList.stream().filter(i-> !(integerSet.add(i))).sorted().distinct()
                //.sorted(Comparator.reverseOrder())
                 .forEach(System.out::println);

    }
}
