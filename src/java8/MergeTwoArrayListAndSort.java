package java8;

//Merge two Employee ArrayList and sort by age in using java8 stream API

import java8.modal.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoArrayListAndSort {

    public static void main(String[] args) {

        List<Employee> empList1 = Arrays.asList(
                new Employee("Aman",25,'M'),
                new Employee("sanket", 24,'M'),
                new Employee("Abhijeet",27,'M')
        );

        List<Employee> empList2 = Arrays.asList(
                new Employee("Ankit",25,'M'),
                new Employee("sahil", 24,'M'),
                new Employee("Aanand",27,'M')
        );

        List<Employee> mergedAndSorted = Stream.concat(empList1.stream(),empList2.stream())
                .sorted(Comparator.comparingInt(Employee::getEmpAge)) //e-> e.getEmpAge()
                .collect(Collectors.toList());

        mergedAndSorted.forEach(employee -> System.out.println(employee));


    }
}
