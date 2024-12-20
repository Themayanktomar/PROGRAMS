package lambdaexamples;



import java.util.Arrays;
import java.util.List;

public class MaxAgeEmployee {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("John", 25 , 5000),
                new Employee("Jane", 30 , 4500),
                new Employee("Bob", 28 , 4565)
        );

        int maxAge = employees.stream()
                .mapToInt(Employee -> Employee.getSalary())
                .max()
                .orElse(0);
        System.out.println(maxAge);



    }
}
