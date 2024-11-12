package trickyjava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListExample {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();

        // First thread adds numbers from 1 to 5
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                list.add(i);
            }
        });

        // Second thread adds numbers from 6 to 10
        Thread t2 = new Thread(() -> {
            for (int i = 6; i <= 10; i++) {
                list.add(i);
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // This may print fewer than 10 elements because of thread interference
        System.out.println("Normal ArrayList size: " + list.size());
    }
}


class test{

    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        // First thread adds numbers from 1 to 5
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                list.add(i);
            }
        });

        // Second thread adds numbers from 6 to 10
        Thread t2 = new Thread(() -> {
            for (int i = 6; i <= 10; i++) {
                list.add(i);
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // This will always print 10 because the list is synchronized
        System.out.println("Synchronized ArrayList size: " + list.size());


    }
}