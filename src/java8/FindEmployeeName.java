package java8;

import java8.modal.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//How to find employees name starting with alphabet A using stream API
public class FindEmployeeName {

    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee("Aman",27,'M'),
                new Employee("Abhijeet",35,'M'),
                new Employee("Bhushan",30,'M'),
                new Employee("Darshan",26,'M'),
                new Employee("Adarsh",24,'M')
        );

        List<Employee> empStartingWithA = empList.stream().sorted(Comparator.comparingInt(Employee::getEmpAge))
                .filter(e -> e.getEmpName().startsWith("A"))
                .collect(Collectors.toList());

        empStartingWithA.forEach(employee -> System.out.println(employee));

        System.out.println("\nUsing method reference\n");

        empStartingWithA.forEach(System.out::println);
    }
}
