package java8Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q2Point1DuplicateNumber {

    public static void main(String[] args) {

        Integer [] integersArray = {1,1,1,2,2,3,4,5,6,7,8,9,0,6,4};

        //Convert Arrays to a List
        List<Integer> integerList = Arrays.asList(integersArray);

        //Use Java 8 stream API to group elements by counting occurrence
        Map<Integer, Long> collect = integerList.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        // Print Duplicate Numbers
        collect.forEach((num,count)-> {
            //System.out.println(num+":"+count);
            if (count>1) {
                System.out.println(num);
            }
        });
    }
}
