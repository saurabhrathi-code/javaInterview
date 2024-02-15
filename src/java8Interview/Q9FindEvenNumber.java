package java8Interview;

import java.util.Arrays;

public class Q9FindEvenNumber {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        Arrays.stream(arr).filter(x -> x % 2 == 0).forEach(System.out::println);
    }
}
