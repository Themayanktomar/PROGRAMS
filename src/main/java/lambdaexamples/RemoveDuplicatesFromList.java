package lambdaexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 2, 7, 1, 5, 2, 4, 6);
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctNumbers);

    }
}
