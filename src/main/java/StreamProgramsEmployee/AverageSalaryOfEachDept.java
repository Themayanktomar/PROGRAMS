package StreamProgramsEmployee;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AverageSalaryOfEachDept {

    public static void main(String[] args) {

        Map<String, Double> averageSalOfEachDeptMap = Employee.getEmployeeList().stream().collect(Collectors.groupingBy(Employee::getDeptName,
                Collectors.averagingDouble(Employee::getSalary)));
        Set<Map.Entry<String, Double>> entrySet = averageSalOfEachDeptMap.entrySet();
        for (Map.Entry<String, Double> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}