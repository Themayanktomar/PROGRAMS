package StreamProgramsEmployee;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestPaidEmployeeBasedOnGender {

    public static void main(String[] args) {

     Map<String , Optional<Employee>> result =  Employee.getEmployeeList().stream().collect(Collectors.groupingBy(Employee::getGender,
                Collectors.maxBy((t1, t2) -> (int) (t1.getSalary() - t2.getSalary()))));
        System.out.println("Highest paid male and female employee : " + result);

    }
}
