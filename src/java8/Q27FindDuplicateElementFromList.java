package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//Q27: How do you extract duplicate elements from an array?
public class Q27FindDuplicateElementFromList {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Saurabh", "Anannya", "Rajat","Nidhi","Adi","Arav","Sam","Rajat", "Sam",
                "Nidhi");

        Set<String> stringSet = new HashSet<>();
        stringList.stream().filter(i -> ! stringSet.add(i)).forEach(System.out::println);
    }
}
