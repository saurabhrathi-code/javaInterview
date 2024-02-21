package java8Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//15. Write a program to append char in char ex-input- {A, B, C} output->[A_X, B_Y, C_Z].
public class Q14CharAppender {
    public static void main(String[] args) {

        List<Character> characterList = Arrays.asList('A', 'B', 'C');

        List<String> collect = characterList.stream()
                .map(ch -> ch + "_" + (char) (ch + 23))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
