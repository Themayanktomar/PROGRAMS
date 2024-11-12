package prepinsta.getting_started;

public class LeapYearOrNot {

    private static void isLeapYear(int year)
    {
        if (year% 400 == 0 || (year % 4 == 0 && year %100 != 0) )
        {
            System.out.println("this is a leap year");
        }else
        {
            System.out.println("this is not a leap year");

        }
    }

    public static void main(String[] args) {
        LeapYearOrNot.isLeapYear(2025);
    }
}
