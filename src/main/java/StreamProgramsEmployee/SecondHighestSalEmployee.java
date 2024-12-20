package StreamProgramsEmployee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SecondHighestSalEmployee {

    public static void main(String[] args) {
        Employee employee = Employee.getEmployeeList().stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().orElse(null);
        System.out.println("Highest employee name :" + employee.getName() + "with sal :" + employee.getSalary());
    }
}
