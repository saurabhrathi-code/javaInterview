package java8;

//Sort Employee based on gender and age is above 30 using Java 8 stream API

import java8.modal.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByGenderAndAbove30Age {

    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee("Aman",27,'M'),
                new Employee("Neeraj",35,'F'),
                new Employee("Naina",31,'F'),
                new Employee("Darshan",35,'M'),
                new Employee("Adarsh",24,'M')
        );

        List<Employee> sortedList = empList.stream()
                .filter(e -> e.getEmpAge()>30)
                .sorted(Comparator.comparingInt(Employee::getEmpAge))
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);

    }
}
