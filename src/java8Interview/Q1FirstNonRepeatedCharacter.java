package java8Interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q1FirstNonRepeatedCharacter {
    public static void main(String[] args) {

        String str = "Java aJtiwmosAclrticle are Awesome";

        //Create a LinkedHashMap to maintain the order of the character
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count occurrence of each character in the String
        str.chars().mapToObj(c -> (char)c)
                .forEach(ch -> charCountMap.merge(ch, 1, Integer::sum));

        //Find the first non-repeated character
        Character character = charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(character);
    }
}
