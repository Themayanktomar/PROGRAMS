package stream.basicstreamprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import  java.util.stream.*;

public class FrequesncyOFElementInList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30 , 10);

        Map<Integer , Long> result = list.stream().collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
        System.out.println(result);

    }
}
