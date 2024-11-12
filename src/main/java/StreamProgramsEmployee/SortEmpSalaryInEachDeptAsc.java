package StreamProgramsEmployee;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortEmpSalaryInEachDeptAsc {

    public static void main(String[] args) {
        Map<String , Stream<Employee>> sortEmpSalaryInEachDeptAscMap =  Employee.getEmployeeList()
                .stream().collect(Collectors.groupingBy(Employee::getDeptName , Collectors
                        .collectingAndThen(Collectors.toList() , list -> list.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)))));
        sortEmpSalaryInEachDeptAscMap.forEach((k,v) -> {
            System.out.println(k);
            System.out.println(v.toList());
        });
    }
}
