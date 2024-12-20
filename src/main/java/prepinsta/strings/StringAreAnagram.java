package prepinsta.strings;

import java.util.Arrays;

public class StringAreAnagram {


    public static void main(String[] args) {

        checkAnagram("aaabb" , "baabaa");
    }

    private static void checkAnagram(String str1, String str2) {


        char[] str1Arr = str1.toLowerCase().toCharArray();
        char[] str2Arr = str2.toLowerCase().toCharArray();
        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);
        if (Arrays.equals(str1Arr, str2Arr))
        {
            System.out.println("These are anagrams");
        }else {
            System.out.println("These are not anagrams" );
        }
    }
}
