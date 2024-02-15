package java8Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q19CubeAndFilter {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);

        integerList.stream().map(x -> x*x*x).filter(cube-> cube > 50).forEach(System.out::println);
    }
}
