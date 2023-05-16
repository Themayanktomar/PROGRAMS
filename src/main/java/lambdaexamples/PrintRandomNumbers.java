package lambdaexamples;

import java.util.Random;

public class PrintRandomNumbers
{
    public static void main(String[] args) {
        Random random = new Random();
        random.ints(10)
                .forEach(System.out::println);

        // random number btw 1 to 100
        random.ints(10, 1, 101)
                .forEach(System.out::println);

    }
}
