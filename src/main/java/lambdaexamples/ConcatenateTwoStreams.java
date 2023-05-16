package lambdaexamples;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConcatenateTwoStreams {
    public static void main(String[] args) {

        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(4, 5, 6);
        Stream<Integer> concatenatedStream = Stream.concat(stream1, stream2);
        concatenatedStream.forEach(System.out::println);

    }
}
