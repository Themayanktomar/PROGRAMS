package multithreadingexample;

public class JoinExample {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread-1: " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread-2: " + i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join(); // Main thread waits for t1 to complete
            t2.join(); // Main thread waits for t2 to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished!");
    }
}
