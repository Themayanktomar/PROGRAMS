package stream.basicstreamprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxOfList {

    List<Integer>  list = Arrays.asList(10,20,30);

    Integer max = list.stream().max(Comparator.naturalOrder()).get();
    Integer min  = list.stream().min(Comparator.naturalOrder()).get();
}
