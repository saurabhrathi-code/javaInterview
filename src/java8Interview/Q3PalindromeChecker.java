package java8Interview;

import java.util.stream.IntStream;

public class Q3PalindromeChecker {
    public static void main(String[] args) {
        String inputString = "l$evel";
        int inputNumber = 123321;

        boolean isStringPalindrome = isPalindrome(inputString);
        System.out.println(isStringPalindrome);

        boolean isNumberPalindrome = isPalindrome(inputNumber);
        System.out.println(isNumberPalindrome);

    }

    private static boolean isPalindrome(String str) {

        String cleanString = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        return IntStream.range(0, cleanString.length()/2)
                .allMatch(i->cleanString.charAt(i) == cleanString.charAt(cleanString.length()-1-i));
    }

    private static boolean isPalindrome(int num) {
        return  isPalindrome(Integer.toString(num));
    }
}
