package java8;

import java.util.Arrays;
import java.util.List;

//Q18: Remove duplicate elements of an array

public class Q18RemoveDuplicatesFromList {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Saurabh", "Anannya", "Rajat","Nidhi","Adi","Arav","Sam","Rajat", "Sam",
                "Nidhi");

        stringList.stream().distinct().forEach(System.out::println);


    }
}
