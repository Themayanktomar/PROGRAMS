package lambdaexamples;
import java.util.Optional;

public class NonRepeatedChar {
    public static void main(String[] args) {

        String str = "mayanksinghtomar";
        Optional<Character> nonRepeatedChar = str.chars()
                .mapToObj(ch -> (char) ch)
                .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
                .findAny();
        nonRepeatedChar.ifPresent(System.out::println);

    }
}
