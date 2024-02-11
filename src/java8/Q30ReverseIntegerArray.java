package java8;


import java.util.stream.IntStream;

public class Q30ReverseIntegerArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

       int[] revArray =  IntStream.rangeClosed(1,arr.length).map(i-> arr[arr.length-i]).toArray();

       for (int ar : revArray) {
           System.out.print(ar);
       }
    }
}
