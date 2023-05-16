package lambdaexamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateFromList {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 8, 3, 5, 1, 2);
        List<Integer> duplicates = numbers.stream()
                .filter(num -> Collections.frequency(numbers, num) > 1)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(duplicates);

    }
}
