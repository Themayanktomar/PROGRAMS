package StreamProgramsEmployee;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestSalDeptWise {

    public static void main(String[] args) {

        Map<String , Optional<Employee>> highestSalDeptWiseMap = Employee.getEmployeeList()
                .stream().collect(Collectors.groupingBy(Employee::getDeptName , Collectors
                        .collectingAndThen(Collectors.toList() , list -> list.stream()
                                .max(Comparator.comparingDouble(Employee::getSalary)))));


        System.out.println("Highest Salary of each dept : " + highestSalDeptWiseMap);
    }
}
