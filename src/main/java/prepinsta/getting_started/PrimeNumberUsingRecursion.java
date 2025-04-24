package prepinsta.getting_started;

public class PrimeNumberUsingRecursion {

    public static void main(String[] args) {

        int num = 33;

       boolean isPrime =  checkPrime(num);
    }

    private static boolean checkPrime(int num) {
        if (num<1)
        {
            return false;
        }
        if (num==1)
        {
            return true;
        }

        return checkPrime(num-1);
    }
}
