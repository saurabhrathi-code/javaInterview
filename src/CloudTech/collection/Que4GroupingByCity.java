package CloudTech.collection;

import com.sun.nio.file.SensitivityWatchEventModifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Que4GroupingByCity {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1("Amar", "Pune");
        Employee1 e2 = new Employee1("Raj", "Pune");
        Employee1 e3 = new Employee1("Neha", "Mumbai");
        Employee1 e4 = new Employee1("Sam", "Mumbai");

        List<Employee1> employeeList = Arrays.asList(e1,e2,e3,e4);

        Map<String, List<Employee1>> groupedBy =
                employeeList.stream().collect(Collectors.groupingBy(e -> e.getCity())); //Employee1::getCity;

        System.out.println(groupedBy);


    }
}
