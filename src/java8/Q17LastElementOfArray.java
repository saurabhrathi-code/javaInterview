package java8;

import java.util.Arrays;

//Q17: Last element of the array
public class Q17LastElementOfArray {
    public static void main(String[] args) {
        String[] stringArray = {"Saurabh", "Anannya", "Rajat","Nidhi","Adi","Arav","Sam"};

        String s = Arrays.stream(stringArray).skip(stringArray.length-1).findFirst().get();

        System.out.println(s);

    }
}
