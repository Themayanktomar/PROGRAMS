package prepinsta.getting_started;

public class EvenOrOdd {

    public static void checkEvenNum(int num)
    {
        if (num%2==0)
        {
            System.out.println("number is even");
        }else
        {
            System.out.println("number is odd");
        }
    }

    public static void main(String[] args) {

        EvenOrOdd.checkEvenNum(11);
    }
}
