package StreamProgramsEmployee;

import java.util.Map;
import java.util.stream.Collectors;

public class NumOfEmpInDepartment {

    public static void main(String[] args) {

        Map<String , Long>  numOfEmpInDeptMap = Employee.getEmployeeList().stream()
                .collect(Collectors.groupingBy(Employee::getDeptName , Collectors.counting()));

        System.out.println(numOfEmpInDeptMap);
    }
}
