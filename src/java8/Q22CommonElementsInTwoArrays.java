package java8;


import java.util.Arrays;
import java.util.HashSet;

public class Q22CommonElementsInTwoArrays {
    public static void main(String[] args) {

        Integer[] arr1 = {1,3,2,54,65,23,89,87,54};
        Integer[] arr2 = {6,32,1,3,5,32,32,54,56};

        HashSet<Integer> integerHashSet = new HashSet<>(Arrays.asList(arr1));

        Arrays.stream(arr2)
                .filter(x->integerHashSet.contains(x))
                .forEach(System.out::println);

    }


}
