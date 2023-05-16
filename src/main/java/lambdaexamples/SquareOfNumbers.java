package lambdaexamples;

import java.util.Arrays;
import java.util.List;

public class SquareOfNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,8,7);
        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println);

    }
}
