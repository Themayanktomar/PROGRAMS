package StreamProgramsEmployee;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;



public class DepartmentWithHighestEmployee {

    public static void main(String[] args) {

       String depWithMaxEmployee =  Employee.getEmployeeList().stream().collect(Collectors
                       .groupingBy(Employee::getDeptName , Collectors.counting()))
                    .entrySet().stream().max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey) // Extract the department name
                .orElse(null);

       Map<String , Long> re = Employee.getEmployeeList().stream().collect(Collectors
               .groupingBy(Employee::getDeptName , Collectors.counting()));
        System.out.println("Dept with max emp name  : " + re.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElseThrow());
        }
}
