package StreamProgramsEmployee;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHighestSalaryDeptWise {

    public static void main(String[] args) {

       Map<String , Employee> result = Employee.getEmployeeList().stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,
                Collectors.collectingAndThen(Collectors.toList(),
                        list -> list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)
                                        .reversed())
                                .skip(1).findFirst().orElseThrow())));

        System.out.println("Second Highest Salary of each dept : " + result);
    }
}
