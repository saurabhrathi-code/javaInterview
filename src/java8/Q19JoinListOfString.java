package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Q12: Join the list of strings with Prefix, Suffix and Delimiter
public class Q19JoinListOfString {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Saurabh", "Anannya", "Rajat","Nidhi","Adi","Nidhi");

        String collect = stringList.stream().collect(Collectors.joining("Delimiter", "prefix", "suffix"));
        System.out.println(collect);

    }
}
