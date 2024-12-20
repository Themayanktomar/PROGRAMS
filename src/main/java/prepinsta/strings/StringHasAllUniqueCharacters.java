package prepinsta.strings;

public class StringHasAllUniqueCharacters {

    public static void main(String[] args) {

        System.out.println("is string  has all unique characters : " + isAllUniqueChar("mayank"));
    }

    private static boolean isAllUniqueChar(String str) {

        for (int i = 0 ; i<str.length() ; i++)
        {
            char  c  = str.charAt(i);
            if (str.indexOf(c) != str.lastIndexOf(c))
            {
                return false;
            }
        }
        return true;

    }
}
