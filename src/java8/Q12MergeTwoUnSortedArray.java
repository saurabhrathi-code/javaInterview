package java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Q12MergeTwoUnSortedArray {
    public static void main(String[] args) {

        int[] arr1 = {1,3,2,54,65,23,89,87,54};
        int[] arr2 = {6,32,1,4,5,32,32,76,56};

        int[] merge = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2))
                .sorted().distinct().toArray();

        for (int a : merge) {
            System.out.println(a);
        }

    }
}
