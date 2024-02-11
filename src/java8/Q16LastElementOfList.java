package java8;

import java.util.Arrays;
import java.util.List;

//Q16: Last element of the arrayList
public class Q16LastElementOfList {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Saurabh", "Anannya", "Rajat","Nidhi","Adi","Arav","Sam");

        String s = stringList.stream().skip(stringList.size() - 1).findFirst().get();

        System.out.println(s);

    }
}
