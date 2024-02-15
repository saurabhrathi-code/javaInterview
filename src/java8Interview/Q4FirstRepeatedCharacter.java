package java8Interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q4FirstRepeatedCharacter {
    public static void main(String[] args) {

        String str = "Java atiwmosAclrticle are Awesome";

        Map<Character,Integer> charCountMap = new LinkedHashMap<>();

        str.chars().mapToObj(c->(char) c)
                .forEach(ch -> charCountMap.merge(ch,1,Integer::sum));

        Character character = charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(character);


    }
}
