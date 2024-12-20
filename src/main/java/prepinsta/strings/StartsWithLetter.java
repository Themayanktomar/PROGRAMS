package prepinsta.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartsWithLetter {


    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(Arrays.asList("Apple" , "Banana" , "Ananas"));

        List<String> res =  strings.stream().filter(s -> s.startsWith("A")).toList();
        System.out.println(res);
    }
}

