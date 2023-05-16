package lambdaexamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortIntegerList {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 8, 3, 1);
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
