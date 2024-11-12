package StreamProgramsEmployee;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

public class AverageAndTotalSalaryOfOrg {

    public static void main(String[] args) {

        DoubleSummaryStatistics doubleSummaryStatistics = Employee.getEmployeeList().stream().collect(Collectors
                .summarizingDouble(Employee::getSalary));
        System.out.println("Average salary of org : " + doubleSummaryStatistics.getAverage());
        System.out.println("Total salary of org : " + doubleSummaryStatistics.getSum());
    }
}
