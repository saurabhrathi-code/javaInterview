package CloudTech.collection;

import java.util.Arrays;
import java.util.List;

public class Que14SequentialAndParallelStream {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4);

        System.out.println("Sequential Stream:");
        numbers.stream().forEach(e -> {
            System.out.println(e + " " + Thread.currentThread().getName());
        });

        System.out.println("Parallel Stream:");

        numbers.parallelStream().forEach(e -> {
            System.out.println(e + " " + Thread.currentThread().getName());
        });
    }
}
