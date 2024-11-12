package StreamProgramsEmployee;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHighestSal {

    public static void main(String[] args) {

        Optional<Employee> emp = Employee.getEmployeeList().stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();

        emp.ifPresent(val -> System.out.println("SecondHighest Sal :: " + val.getSalary()));
    }
    
}
