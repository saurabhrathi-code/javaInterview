package CloudTech.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Que15AverageRateOfMaleAndFemale {
    public static void main(String[] args) {
        List<Employee3> employeeList = new ArrayList<>();

        employeeList.add(new Employee3("ABC", 30, "Female","HR"));
        employeeList.add(new Employee3("PQR", 25, "Male","IT"));
        employeeList.add(new Employee3("LMN", 30, "Male","HR"));
        employeeList.add(new Employee3("XYZ", 28, "Female","IT"));

        //Q1: print all the department and department should be distinct
        employeeList.stream().map(emp -> emp.getDepartment()).distinct().forEach(System.out::println);

      //  Q2: find count of employee from each department
        Map<String, Long> collect1 = employeeList.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.counting()));

        // Q3: Average rate of male and female employee
        Map<String, Double> collect2 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee3::getGender, Collectors.averagingInt(Employee3::getAge)));

        System.out.println("Que2: "+collect1);
        System.out.println("Que3: "+collect2);

    }
}
