package CloudTech.collection;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Que13HighestSalaryFromEachDepartment {
    public static void main(String[] args) {

        List<Employee2> employee2List = Arrays.asList(
                new Employee2("Emp1", "CS", 10000),
                new Employee2("Emp2", "CS", 15000),
                new Employee2("Emp3", "IT", 20000),
                new Employee2("Emp4", "IT", 25000));

       // Map<String, List<Employee2>> collect1 = employee2List.stream().collect(Collectors.groupingBy(e -> e
        // .getDepartment()));

        Map<String, Employee2> collect = employee2List.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(),
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(e -> e.getSalary())),
                                Optional::get)));

        System.out.println(collect);

    }
}





/* input:
 List<Employee> employee = Arrays.asList(
       new Employee("Emp1", "CS", 10000),
       new Employee("Emp2", "CS", 15000),
       new Employee("Emp3", "IT", 20000),
       new Employee("Emp4", "IT", 25000));

 output:
     CS : Employee("Emp2","CS", 15000)
     IT : Employee("Emp4", "IT", 25000)

 */
