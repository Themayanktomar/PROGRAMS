package StreamProgramsEmployee;

import javax.swing.text.html.Option;
import java.util.Comparator;
import java.util.Optional;

public class YoungestFemaleEmployee {

    public static void main(String[] args) {

        Optional<Employee> youngestFemaleEmp = Employee.getEmployeeList().stream().filter(employee -> employee
                .getGender().equals("F")).min(Comparator.comparingInt(Employee::getAge));

        youngestFemaleEmp.ifPresent(val -> System.out.println("Youngest female emp : " + val));
    }
}
