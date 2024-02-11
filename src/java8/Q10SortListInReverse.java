package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Q10: Sort the list in reverse order
public class Q10SortListInReverse {
    public static void main(String[] args) {

        List<Integer> integerList  = Arrays.asList(1,43,53,14,67,12,54,23,2,3,6,4);

         integerList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

                //.collect(Collectors.toList());

        //System.out.println(integerList1);


    }
}
