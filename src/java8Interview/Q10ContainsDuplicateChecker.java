package java8Interview;

import java.util.Arrays;

public class Q10ContainsDuplicateChecker {
    public static void main(String[] args) {

       // int [] arr = {1,2,3,4,5,2,3,4,6,7,8,4};
        int [] arr = {1,2,3,4,5,6,7,8,9};

        boolean b = Arrays.stream(arr).distinct().count() != arr.length; // using distinct duplicated will remove.

        System.out.println(b);
    }
}
