package stream.basicstreamprograms;

import lambdaexamples.MaxInList;

import java.util.Arrays;
import java.util.List;

public final class RemoveDuplicateFromList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30 , 10);

        List<Integer> res = list.stream().distinct().toList();

    }
}
