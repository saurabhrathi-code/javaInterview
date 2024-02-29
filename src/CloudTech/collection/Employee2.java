package CloudTech.collection;

import java.util.StringJoiner;

public class Employee2 {
    private String name;
    private String department;
    private int salary;

    public Employee2(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Employee2.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("department='" + department + "'")
                .add("salary=" + salary)
                .toString();
    }
}
