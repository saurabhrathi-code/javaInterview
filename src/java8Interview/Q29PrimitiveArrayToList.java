package java8Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q29PrimitiveArrayToList {
    public static void main(String[] args) {

        int [] integerArray = {1,2,3,4,5,6,7};

        List<Integer> integerList = Arrays.stream(integerArray)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(integerList);

    }
}

//Boxed() : convert int to Integer