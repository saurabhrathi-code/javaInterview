package java8;

import java.util.Arrays;

//Q15:Sum and Average of All elements of an array
public class Q15SumAndAverageElementOfArray {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,10};

        int sum = Arrays.stream(arr).sum();
        System.out.println("sum"+sum);

        double avg = Arrays.stream(arr).average().getAsDouble();
        System.out.println("avg:"+avg);
    }
}
