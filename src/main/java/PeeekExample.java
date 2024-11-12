import java.util.stream.Stream;

public class PeeekExample {


    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .peek(n -> System.out.println("Processing: " + n))
                .map(n -> n * n)
                .forEach(System.out::println);
    }
}
