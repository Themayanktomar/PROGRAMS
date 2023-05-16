package lambdaexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxInList {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 8, 3, 1);
        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo); // (a, b) -> a.compareTo(b)
        max.ifPresent(System.out::println); //max.ifPresent(num -> System.out.println(num));

    }
}
