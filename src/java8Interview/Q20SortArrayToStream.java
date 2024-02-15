package java8Interview;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q20SortArrayToStream {
    public static void main(String[] args) {

        int [] intArray = {6,4,5,3,2,5,7,1,9};

        Stream<Integer> sortedStream = Arrays.stream(intArray)
                .boxed()// Convert primitive int to Integer
                .sorted() // sort the stream
                .collect(Collectors.toList()) //collect the sorted stream to a List
                .stream(); // Convert the List back to Stream

        sortedStream.forEach(System.out::println);
    }
}
