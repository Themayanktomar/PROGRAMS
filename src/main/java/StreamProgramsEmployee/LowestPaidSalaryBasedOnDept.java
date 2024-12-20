package StreamProgramsEmployee;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class LowestPaidSalaryBasedOnDept {

    public static void main(String[] args) {

        Map<String, Optional<Employee>> lowestPaidSalaryBasedOnDeptMap2 = Employee.getEmployeeList().stream().collect(Collectors
                .groupingBy(Employee::getDeptName, Collectors.collectingAndThen(Collectors
                        .toList(), list -> list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                        .skip(1).findFirst())));
        lowestPaidSalaryBasedOnDeptMap2.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v.get());
        });
    }

}
