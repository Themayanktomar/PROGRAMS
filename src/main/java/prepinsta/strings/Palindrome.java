package prepinsta.strings;

public class Palindrome {

    public static void main(String[] args) {

        String s = "aba";
        String reverse = "";
        for (int i = s.length() - 1 ; i >=0 ; i--)
        {
            reverse = reverse + s.charAt(i);
        }

        if (s.equals(reverse))
        {
            System.out.println("String is paalindrome");
        }
    }
}
