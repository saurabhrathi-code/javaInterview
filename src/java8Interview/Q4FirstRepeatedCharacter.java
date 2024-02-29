package java8Interview;

import java.util.LinkedHashMap;
import java.util.Map;
//4. Given a String, find the first repeated character in it using Stream functions?
//String input = "Java articles are Awesome";
public class Q4FirstRepeatedCharacter {
    public static void main(String[] args) {

        String s = "Java JatiwmosAclrticle are Awesome";

/*
        Map<Character,Integer> charCountMap = new LinkedHashMap<>();

        str.chars().mapToObj(c->(char) c)
                .forEach(ch -> charCountMap.merge(ch,1,Integer::sum));

        Character character = charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(character);

*/
        LinkedHashMap<Character,Integer> charCountMap = new LinkedHashMap<>();

        s.chars().mapToObj(c->(char) c).forEach(ch-> charCountMap.merge(ch,1,Integer::sum));

        Character c =
                charCountMap.entrySet().stream()
                        .filter(entry-> entry.getValue()>1)
                        .map(Map.Entry::getKey)
                        .findFirst()
                        .orElse(null);

        System.out.println(c);
    }
}
