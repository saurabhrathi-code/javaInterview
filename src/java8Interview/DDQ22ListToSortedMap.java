package java8Interview;

import java8Interview.modal.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//23. How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
public class DDQ22ListToSortedMap {
    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student(1,"sam",24),
                new Student(2,"tom",21),
                new Student(1, "adi", 25),
                new Student(2, "nick", 34)
        );

      //  Map<Integer, String> stringMap = list.stream().collect(Collectors.toMap(x -> list.indexOf(x), x -> x));


        Map<Integer, String> collect =
                studentList.stream().collect(Collectors.toMap(key -> key.getId(),
                value -> value.getName()));
        System.out.println(collect);
    }
}
