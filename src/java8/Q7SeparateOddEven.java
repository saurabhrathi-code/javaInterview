package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q7SeparateOddEven {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Map<Boolean, List<Integer>> oddEvenMap = num.stream()
                .collect(Collectors.partitioningBy(n-> n%2==0));

        System.out.println("odd "+ oddEvenMap.get(false));
        System.out.println("Even " + oddEvenMap.get(true));
    }
}
