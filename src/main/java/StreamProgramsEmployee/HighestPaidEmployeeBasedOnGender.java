package StreamProgramsEmployee;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestPaidEmployeeBasedOnGender {

    public static void main(String[] args) {

        Map<String , Optional<Employee>> highestPaid = Employee.getEmployeeList().stream()
                .collect(Collectors.groupingBy(Employee::getGender
                , Collectors.collectingAndThen(Collectors.toList(), list -> list.stream()
                                .max(Comparator.comparingDouble(Employee::getSalary)))));

        System.out.println("Highest paid male and female employee : " + highestPaid);

    }
}
