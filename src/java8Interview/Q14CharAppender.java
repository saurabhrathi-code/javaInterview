package java8Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q14CharAppender {
    public static void main(String[] args) {

        List<Character> characterList = Arrays.asList('A', 'B', 'C');

        List<String> collect = characterList.stream()
                .map(ch -> ch + "_" + (char) (ch + 23))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
