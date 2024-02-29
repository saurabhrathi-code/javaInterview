package CloudTech.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Que16FilterPatientWithDisease {
    public static void main(String[] args) {

        Patient p1 = new Patient("P1",20,"Corona",18000);
        Patient p2 = new Patient("P2",26,"Fever",6000);
        Patient p4 = new Patient("P4",29,"Corona",8000);
        Patient p3 = new Patient("P3",23,"Corona",12000);

        List<Patient> patientList = Arrays.asList(p1,p2,p3,p4);

        patientList.stream()
                .filter(p -> p.getDisease().equals("Corona") && p.getAge() < 25)
                .forEach(System.out::println);

        Double averageBillPaidByCorona = patientList.stream()
                .filter(p -> p.getDisease().equals("Corona"))
                .collect(Collectors.averagingDouble(Patient::getAmount));

        System.out.println("Average Bill Paid By Corona patient: " + averageBillPaidByCorona);

    }
}