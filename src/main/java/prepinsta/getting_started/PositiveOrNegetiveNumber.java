package prepinsta.getting_started;

public class PositiveOrNegetiveNumber {

    public static void isPositiveOrNegetive(int num)
    {
        if (num>0)
        {
            System.out.println("Number is positive");
        }else
        {
            System.out.println("Number is negetive");
        }
    }

    public static void main(String[] args) {

        PositiveOrNegetiveNumber.isPositiveOrNegetive(44);

    }
}
