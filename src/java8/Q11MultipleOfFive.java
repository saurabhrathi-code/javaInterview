package java8;

import java.util.Arrays;
import java.util.List;

//Q11: print multiple of five from the list
public class Q11MultipleOfFive {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,19,10,15,24,2,85,5,30);

        list.stream().filter(x->x%5==0).forEach(System.out::println);
    }
}
