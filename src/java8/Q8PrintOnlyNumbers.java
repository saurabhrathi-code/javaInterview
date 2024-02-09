package java8;

import java.util.Arrays;


public class Q8PrintOnlyNumbers {
    public static void main(String[] args) {

        Character[] alphanumericArray = {'a', '1', 'b', '2', 'c', '3', 'd', '4', 'e', '5'};

        Arrays.stream(alphanumericArray)
                .filter(Character::isDigit)
                .forEach(System.out::print);
    }
}
