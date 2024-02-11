package java8;


import java.util.Arrays;
import java.util.List;

//Q23: Common elements between two array List
public class Q23CommonElementsInTwoArrayList {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,3,2,54,65,23,89,87,54);
        List<Integer> integerList1 = Arrays.asList(6,32,1,3,5,32,32,54,56);

        //integerList.stream().filter(i-> integerList1.contains(i)).forEach(System.out::println);

        integerList.stream().filter(integerList1::contains).distinct().forEach(System.out::println);


    }


}
