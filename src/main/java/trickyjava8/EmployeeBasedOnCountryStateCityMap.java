package trickyjava8;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeBasedOnCountryStateCityMap {

    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Rahul", "India", "Maharashtra", "Mumbai"),
                new Employee("Priya", "India", "Maharashtra", "Pune"),
                new Employee("Ankit", "Bhutan", "Karnataka", "Bangalore"),
                new Employee("Sneha", "India", "Tamil Nadu", "Chennai"),
                new Employee("Ravi", "India", "Delhi", "New Delhi")        );

        // Create the nested map: Country -> State -> City -> List<Employee>
        Map<String, Map<String, Map<String, List<Employee>>>> employeeMap = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getCountry,
                        Collectors.groupingBy(
                                Employee::getState,
                                Collectors.groupingBy(
                                        Employee::getCity,
                                        Collectors.toList()
                                )
                        )
                ));



        // Print the result
        System.out.println(employeeMap);
    }


}
class Employee{
    private String name;
    private String country;
    private String state;
    private String city;

    // Constructor
    public Employee(String name, String country, String state, String city) {
        this.name = name;
        this.country = country;
        this.state = state;
        this.city = city;
    }

    // Getters
    public String getName() { return name; }
    public String getCountry() { return country; }
    public String getState() { return state; }
    public String getCity() { return city; }

    @Override
    public String toString() {
        return name; // Just for simplicity when printing
    }
}