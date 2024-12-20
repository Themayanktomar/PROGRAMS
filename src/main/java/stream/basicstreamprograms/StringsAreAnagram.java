package stream.basicstreamprograms;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringsAreAnagram {


    public static void main(String[] args) {

        String s = "aba";
        String s1  = "aab";
        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        s = Stream.of(s.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if (s1.equals(s))
        {
            System.out.println("Strings are  anagram");
        }
    }

}
