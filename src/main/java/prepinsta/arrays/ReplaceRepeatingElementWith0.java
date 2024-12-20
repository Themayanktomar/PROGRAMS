package prepinsta.arrays;

import prepinsta.strings.Palindrome;

public class ReplaceRepeatingElementWith0 {

    public static void main(String[] args) {

        int[] arr = {10,10,20,30};

        for (int i  = 0 ; i<arr.length ; i++)
        {
            for (int j  = i+1 ; j<arr.length ; j++)
            {
                if (arr[i] == arr[j])
                {
                    arr[i] =  0;
                    arr[j] =  0;
                }
            }
        }
       for (int i : arr)
       {
           System.out.println(i);
       }
    }
}
