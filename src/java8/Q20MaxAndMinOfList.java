package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Q20: Max and Min in a List
public class Q20MaxAndMinOfList {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Integer integer = integerList.stream().max(Comparator.naturalOrder()).get();
        System.out.println("max:"+integer);

        Integer integer1 = integerList.stream().min(Comparator.naturalOrder()).get();
        System.out.println("min:"+integer1);

    }
}
