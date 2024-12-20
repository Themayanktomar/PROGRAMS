package lambdaexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfCharInString {
    public static void main(String[] args) {

        String string  = "mayank";
        Map<Character , Long> characterLongMap = string.chars().mapToObj(s -> (char)s)
                .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
        characterLongMap.forEach((k , v) ->
                        System.out.println(k + " -> " + v)
                );


        List<String> list = Arrays.asList("Red" , "Red" , "Yellow");

      Map<String  , Long> res =  list.stream().filter(col -> col.equalsIgnoreCase("red")).collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
        System.out.println(res);
    }

}
