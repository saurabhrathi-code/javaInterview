package java8;

//Q.You have been given an employee list with EMP<Id, Name, Salary, Deptt>,
// find the highest salary of an employee from the HR department.

import java8.modal.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Q6HighestSalary {

    public static void main(String[] args) {

        List<Employee> empList = Arrays.asList(
                new Employee("Aman", 27, 'M'),
                new Employee("Abhijeet", 35, 'M'),
                new Employee("Bhushan", 30, 'M'),
                new Employee("Darshan", 92, 'M'),
                new Employee("Adarsh", 80, 'M')
        );

        Optional<Employee> highestAge = empList.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getEmpAge)));

        System.out.println(highestAge);
    }
}
