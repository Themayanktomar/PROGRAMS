package lambdaexamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringsPerLength {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        strings.sort(Comparator.comparingInt(String::length));
        System.out.println(strings);

    }
}
