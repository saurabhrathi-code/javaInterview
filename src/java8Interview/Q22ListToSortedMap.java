package java8Interview;

import java8Interview.modal.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q22ListToSortedMap {
    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student(1,"sam",24),
                new Student(2,"tom",21),
                new Student(1, "adi", 25),
                new Student(2, "nick", 34)
        );

        Map<Integer, String> collect = studentList.stream().collect(Collectors.toMap(key -> key.getId(),
                value -> value.getName()));
        System.out.println(collect);
    }
}
