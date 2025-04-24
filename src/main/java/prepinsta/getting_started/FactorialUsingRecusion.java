package prepinsta.getting_started;

public class FactorialUsingRecusion {


    public static void main(String[] args) {
        System.out.println(factorial(4));

        int terms = 7;
        System.out.print("Fibonacci sequence up to " + terms + " terms: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int factorial(int num) {

        if (num == 1)
        {
            return 1;
        }
        return num*factorial(num-1);
    }


    public static int fibonacci(int n) {
        if (n == 0) { // Base case
            return 0;
        }
        if (n == 1) { // Base case
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }

}
