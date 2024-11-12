package prepinsta.getting_started;

public class PrimeNumber {

    public static void main(String[] args) {

      PrimeNumber.isPrimeNumber(47);
    }

    private static void isPrimeNumber(int num) {
        boolean isPrime = true;
        if (num > 0)
        {

            for (int i = 2 ; i <num ; i++)
            {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }

            }

        }
        if (isPrime)
        {
            System.out.println("this is a prime number");
        }else {
            System.out.println("this is not a prime number");
        }

        }
}
