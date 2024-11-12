package StreamProgramsEmployee;

import java.util.Comparator;
import java.util.Optional;

public class HighestExperiencedEmployee {

    public static void main(String[] args) {

     Optional<Employee> highestExperiencedEmployee = Employee.getEmployeeList().stream().min(Comparator.comparingInt(Employee::getYearOfJoining));

     highestExperiencedEmployee.ifPresent(val -> System.out.println("Highest  Experinced Employee ::" + val));
    }
}
