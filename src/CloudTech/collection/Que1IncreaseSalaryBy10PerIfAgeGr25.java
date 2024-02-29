package CloudTech.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Que1IncreaseSalaryBy10PerIfAgeGr25 {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        Employee e1 = new Employee("ABc", 21, 10000);
        Employee e2 = new Employee("bBc", 26, 12000);
        Employee e3 = new Employee("cBc", 28, 15000);
        Employee e4 = new Employee("dBc", 22, 17000);
        Employee e5 = new Employee("eBc", 23, 19000);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        List<Employee> incrementedSalary = employeeList.stream()
                .map( e -> {
                    if(e.getAge()>25) {
                        e.setSalary(e.getSalary() * 1.10);
                        }
                        return e;
                }).collect(Collectors.toList());

        System.out.println(incrementedSalary);
    }
}
