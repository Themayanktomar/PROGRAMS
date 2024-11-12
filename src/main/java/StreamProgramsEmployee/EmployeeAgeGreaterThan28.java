package StreamProgramsEmployee;

public class EmployeeAgeGreaterThan28 {

    public static void main(String[] args) {
        Employee.getEmployeeList().stream().filter(emp -> emp.getAge() > 30).forEach(System.out::println);
    }
}
