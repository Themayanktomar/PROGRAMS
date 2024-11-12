package StreamProgramsEmployee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

    public static void main(String[] args) {

        Employee.getEmployeeList().stream().map(Employee::getAge).forEach(System.out::println);
    }
}
