package java8Interview;

import java.util.Arrays;
import java.util.List;

//14. Write a program to sum a list - initial value is 100. for ex 100+ (sum_of_elements).
public class Q13ListSumWithInitialValue {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5);

        int intValue = integerList.stream().reduce(100, Integer::sum).intValue();
        System.out.println(intValue);
    }
}
