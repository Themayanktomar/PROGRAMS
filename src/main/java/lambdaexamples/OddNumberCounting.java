package lambdaexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddNumberCounting {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,1,1,2,2,3);
        List<Map.Entry<Integer , Long>> map = integers.stream().collect(Collectors.groupingBy(x -> x, Collectors
                .counting())).entrySet().stream().filter(i -> i.getValue()%2!=0).toList();
        System.out.println(map);
    }
}
