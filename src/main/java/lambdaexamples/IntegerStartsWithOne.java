package lambdaexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class IntegerStartsWithOne {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 18, 31, 12);
        List<Integer> integerStartingWithOne = numbers.stream()
                .filter(num -> String.valueOf(num).startsWith("1"))
                        .collect(Collectors.toList());

        System.out.println(integerStartingWithOne);

    }
}
