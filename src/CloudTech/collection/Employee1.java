package CloudTech.collection;

import java.util.StringJoiner;

public class Employee1 {

    private String name;
    private String city;

    public Employee1(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Employee1.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
               // .add("city='" + city + "'")
                .toString();
    }
}