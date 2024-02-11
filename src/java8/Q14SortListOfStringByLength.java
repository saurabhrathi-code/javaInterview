package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Q14: SOrt the list of string in increasing order og their length
public class Q14SortListOfStringByLength {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Saurabh", "Anannya", "Rajat","Nidhi","Adi","Arav","Sam");

        stringList.stream().sorted(Comparator.comparing(s->s.length())).forEach(System.out::println);

        //stringList.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

    }
}
