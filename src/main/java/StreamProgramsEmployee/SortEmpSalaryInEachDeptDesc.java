package StreamProgramsEmployee;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortEmpSalaryInEachDeptDesc {
    public static void main(String[] args) {

        Map<String , Stream<Employee>> sorterEmpBySalByDeptInDescMap = Employee.getEmployeeList().stream()
                .collect(Collectors.groupingBy(Employee::getDeptName , Collectors.collectingAndThen(Collectors
                        .toList() , list -> list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)
                        .reversed()))));

        System.out.println("The sorted Employees based on salary in each departMenet :");
        sorterEmpBySalByDeptInDescMap.forEach((k,v) -> {
                    System.out.println(k);
                    System.out.println(v.collect(Collectors.toList()));
                }
                );
    }
}
