package java8Interview;

import java.util.Arrays;
import java.util.List;

public class Q13ListSumWithInitialValue {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5);

        int intValue = integerList.stream().reduce(100, Integer::sum).intValue();
        System.out.println(intValue);
    }
}
