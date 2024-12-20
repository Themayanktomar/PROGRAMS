package StreamProgramsEmployee;

import java.util.*;
import java.util.stream.Collectors;

public class AverageAgeOFMaleAndFemaleEmployee {

    public static void main(String[] args) {

        Map<String , Double> averageAgeOFMaleAndFemaleEmpMap = Employee.getEmployeeList().stream()
                .collect(Collectors.groupingBy(Employee::getGender , Collectors.averagingInt(Employee::getAge)));

        DoubleSummaryStatistics doubleSummaryStatistics = Employee.getEmployeeList().stream().collect(Collectors
                .summarizingDouble(Employee::getSalary));
        System.out.println("Average age of Male and Female Employees:: " + averageAgeOFMaleAndFemaleEmpMap);

    }
}
