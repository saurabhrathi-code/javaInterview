package CloudTech.collection;

import java.util.*;

public class Que11RemoveDuplicateNumber {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,1,2,4,5,4,7,8,9);

        Set<Integer> integerSet = new LinkedHashSet<>(integerList);

        List<Integer> updatedList = new ArrayList<>(integerSet);

        System.out.println(updatedList);
    }
}
