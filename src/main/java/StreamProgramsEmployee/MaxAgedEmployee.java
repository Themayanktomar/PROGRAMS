package StreamProgramsEmployee;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class MaxAgedEmployee {

    public static void main(String[] args) {
       Optional<Employee> employee =  Employee.getEmployeeList().stream().max(Comparator
               .comparingInt(Employee::getAge));
        employee.ifPresent(value -> System.out.println("First method  : " + value.getAge()));


        //Another wayy
        OptionalInt optionalInt = Employee.getEmployeeList().stream().mapToInt(Employee::getAge).max();
        if (optionalInt.isPresent())
        {
            System.out.println( "Second method  : " + optionalInt.getAsInt());
        }
    }
}
