package java8Interview;

import java8Interview.modal.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q8FlatteringList {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
          new Employee("Abhijeet",23, Arrays.asList("1234567891", "12473844656")),
          new Employee("Nikhil",24, Arrays.asList("1234567851", "12473844678")),
          new Employee("sam",25, Arrays.asList("1234567834", "12473844656")),
          new Employee("dam",26, Arrays.asList("1234567887", "12473844623"))
          );

        List<String> collect = employeeList.stream().flatMap(e -> e.getPhoneNumber().stream()).collect(Collectors.toList());
        System.out.println(collect);

        //.forEach(System.out::println);
    }
}
