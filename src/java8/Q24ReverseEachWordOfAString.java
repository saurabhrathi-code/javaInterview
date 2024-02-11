package java8;

import java.util.Arrays;
import java.util.stream.Collectors;
//Q24:Reverse each word of a string using Java 8 streams?
public class Q24ReverseEachWordOfAString {
    public static void main(String[] args) {

        String str = "I am a Software Developer";

        String collect = Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(collect);
    }
}
