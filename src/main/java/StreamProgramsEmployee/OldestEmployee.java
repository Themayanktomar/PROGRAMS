package StreamProgramsEmployee;

import java.util.Comparator;
import java.util.Optional;

public class OldestEmployee {

    public static void main(String[] args) {

        Optional<Employee> olderstEmp = Employee.getEmployeeList().stream()
                .max(Comparator.comparingInt(Employee::getAge));
        olderstEmp.ifPresent(value -> System.out.println("Olderst emp " + value));
    }
}
