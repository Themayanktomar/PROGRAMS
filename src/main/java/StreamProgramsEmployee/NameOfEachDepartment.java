package StreamProgramsEmployee;

public class NameOfEachDepartment {

    public static void main(String[] args) {

        Employee.getEmployeeList().stream().map(Employee::getDeptName).distinct().forEach(System.out::println);
    }
}
