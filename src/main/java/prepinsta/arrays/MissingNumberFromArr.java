package prepinsta.arrays;

import java.util.Arrays;

public class MissingNumberFromArr {

    public static void main(String[] args) {

        int[] arr = {1,2,4,5};

        Arrays.sort(arr);
        int temp = arr[0];
        for (int i  = 0 ; i <arr.length ; i++)
        {
            if (temp != arr[i])
            {
                System.out.println(temp);
            }
             temp = arr[i] + 1 ;
        }
    }
}
