package lambdaexamples;



import java.util.Arrays;
import java.util.List;

public class MaxAgeEmployee {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("John", 25),
                new Employee("Jane", 30),
                new Employee("Bob", 28)
        );

        int maxAge = employees.stream()
                .mapToInt(Employee -> Employee.getAge())
                .max()
                .orElse(0);
        System.out.println(maxAge);

    }
}
