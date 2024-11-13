package prepinsta.strings;

public class ReverseString {

    public static void main(String[] args) {

        ReverseString.reverseString("mayank");
    }

    private static void reverseString(String string) {

        char[] arr = string.toCharArray();
        String reversedString = "";
        for (int i = arr.length-1; i>=0 ; i--)
        {
            reversedString = reversedString + arr[i];
        }
        System.out.println(reversedString);
    }


}
