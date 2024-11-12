package StreamProgramsEmployee;

import java.util.Map;
import java.util.stream.Collectors;

public class CountMaleAndFemaleEmployee {
    public static void main(String[] args) {

        Map<String , Long> countMaleAndFemaleEmpMap = Employee.getEmployeeList().stream()
                .collect(Collectors.groupingBy(Employee::getGender , Collectors.counting()));
        System.out.println("Count Of male and Female Emp \n:: " + countMaleAndFemaleEmpMap  );
    }
}
