package reduce;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ResduceExample {

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Use reduce to sum the elements of the list
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum of numbers: " + sum);

        List<String> words = Arrays.asList("Hello", "World", "from", "Java");

        // Use reduce to concatenate the strings
        String result = words.stream()
                .reduce("", (a, b) -> a + " " + b);

        System.out.println("Concatenated String: " + result.trim());
    }
}
