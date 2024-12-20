package lambdaexamples;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class AddSuffixPrefix {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cheeku", "pineapple");

        List<String> modifiedStrings = strings.stream()
                .map(s -> {
                    StringJoiner joiner = new StringJoiner("");
                    joiner.add("fruit").add(s).add("sweet");
                    return joiner.toString();
                })
                .collect(Collectors.toList());

        System.out.println(modifiedStrings);
    }
}
