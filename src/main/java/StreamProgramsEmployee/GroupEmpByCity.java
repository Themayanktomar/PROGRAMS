package StreamProgramsEmployee;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupEmpByCity {

    public static void main(String[] args) {

        Map<String , List<Employee>> employeeByCityMap = Employee.getEmployeeList().stream()
                .collect(Collectors.groupingBy(Employee::getCity));

        System.out.println("Employees grouped by city :: \n" + employeeByCityMap);

    }
}
