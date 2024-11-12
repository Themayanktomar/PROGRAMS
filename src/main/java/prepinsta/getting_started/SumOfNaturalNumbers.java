package prepinsta.getting_started;

public class SumOfNaturalNumbers {

    private static int sumOfNaturalNumbers(int start , int end)
    {
        int sum = 0;
        for (int i = start ; i <= end ; i++)
        {

            sum = sum+i;
        }
        return sum;
    }

    public static void main(String[] args) {

      int sum  =    SumOfNaturalNumbers.sumOfNaturalNumbers(2 , 5);
        System.out.println(sum);
    }
}
