package prepinsta.strings;

public class RemoveVowelFromString {


    public static void main(String[] args) {
        String originalString = "mayank";
        removeMethodOne(originalString);
        removeMethodTwo(originalString);
    }

    private static void removeMethodOne(String originalString) {

        String newString  = originalString.replaceAll("[aeiou]" , "");
        System.out.println(newString);
    }

    private static void removeMethodTwo(String originalString)
    {
        char[] arr = originalString.toCharArray();
        String newStr = "";
        for (int i = 0 ; i<arr.length ; i++)
        {
            if (!isVowwel(arr[i]))
            {
               newStr = newStr+arr[i];
            }
        }
        System.out.println(newStr);

    }

    private static boolean isVowwel(char c) {

       c =   Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }


}
