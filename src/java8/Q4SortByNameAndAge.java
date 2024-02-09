package java8;

//Sort employee byname and salary using java 8 stream API

import java8.modal.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q4SortByNameAndAge {
    public static void main(String[] args) {
/*
        List<Employee> empList = Arrays.asList(
                new Employee("Nikhil",27),
                new Employee("Niraj",35),
                new Employee("Bhushan",30),
                new Employee("Darshan",26),
                new Employee("Adarsh",24)
        );
*/

        List<Employee> empList = new ArrayList<>();
        Employee e1 = new Employee("Ajay",35,'M');
        Employee e2 = new Employee("Vijay",5,'M');
        Employee e3 = new Employee("Zack",30,'M');
        Employee e4 = new Employee("David",51,'M');
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);


/*        List<Employee> empSortedList =  empList.stream().sorted(Comparator.comparing(e-> e.getEmpName()))
                .sorted(Comparator.comparingInt(Employee::getEmpAge))
                .collect(Collectors.toList());
*/

        List<Employee> empSortedList =  empList.stream()
                .sorted(Comparator.comparing(Employee::getEmpName).thenComparing(Employee::getEmpAge))
                .collect(Collectors.toList());

        empSortedList.forEach(System.out::println);
    }
}