package StreamProgramsEmployee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmpByAge {
    public static void main(String[] args) {

        Map<Integer , List<Employee>> groupEmployeeByAgeMAp = Employee.getEmployeeList().stream()
                .collect(Collectors.groupingBy(Employee::getAge));

        System.out.println("EMployee groupBy age \n :: " + groupEmployeeByAgeMAp );
    }
}
