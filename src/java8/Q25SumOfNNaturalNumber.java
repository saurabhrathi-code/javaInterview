package java8;

import java.util.stream.IntStream;

//Q25: 19) How do you find sum of first 10 natural numbers?
public class Q25SumOfNNaturalNumber {
    public static void main(String[] args) {

        int sum = IntStream.range(1, 11).sum();
        System.out.println(sum);
    }
}
