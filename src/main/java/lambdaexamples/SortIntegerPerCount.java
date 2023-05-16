package lambdaexamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortIntegerPerCount {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2,2, 8, 3,1,1,1, 1);
        numbers.sort(Comparator.comparingInt(i -> Collections.frequency(numbers, i)));
        List<Integer> result = numbers.stream().collect(Collectors.toList());
        System.out.println(result);

    }
}