package CloudTech.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Que3SortHashMapByValue {
    public static void main(String[] args) {
        Map<String,Integer> empMap = new HashMap<>();
        empMap.put("ankit",24);
        empMap.put("simba",32);
        empMap.put("nil",1);
        empMap.put("ani",1);
        empMap.put("avi",13);


        LinkedHashMap<String, Integer> collect = empMap.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        // we have used (e1,e2) -> e1 if two values are same then it will consider e1.

        System.out.println(collect);
    }
}
