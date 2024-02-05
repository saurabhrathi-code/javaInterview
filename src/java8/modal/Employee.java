package java8.modal;

import java.util.StringJoiner;

public class Employee {

    private String empName;
    private int empAge;
    private char gender;

    public Employee(String empName, int empAge, char gender ) {
        this.empName = empName;
        this.empAge = empAge;
        this.gender = gender;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]")
                .add("empName='" + empName + "'")
                .add("empAge=" + empAge)
                .add("gender=" + gender)
                .toString();
    }
}
