package java8Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//11. Write a program to sort the 2 lists in descending order.
public class Q11DescendingSorter {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,24,65,4,5,6,7,8,9,10);

        List<String> stringList = Arrays.asList("Amazon","Netflix","Microsoft","PhonePay","Google");

        integerList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        //integerList.stream().sorted((a,b)->b.compareTo(a)).forEach(System.out::print);
        //integerList.stream().sorted((a,b) -> Integer.compare(b,a)).forEach(System.out::print);

        stringList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);




    }
}
