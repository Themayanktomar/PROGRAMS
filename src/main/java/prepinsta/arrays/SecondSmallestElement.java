package prepinsta.arrays;

import java.util.Arrays;

public class SecondSmallestElement {

    public static void main(String[] args) {

        int[] arr = {90,20,30,40,50};
        Arrays.sort(arr);
        System.out.println(arr[1]);
        int smallest = arr[0];
        for (int i=0; i < arr.length; i++){
            if(arr[i] < smallest)
            {
                smallest = arr[i];

            }
        }

        int secSmallest = Integer.MAX_VALUE;
        for(int i  = 0 ; i<arr.length ; i++)
        {
            if (arr[i] != smallest && arr[i] < secSmallest )
            {
                secSmallest = arr[i];
            }
        }

        System.out.println("Second Smallest number is : " + secSmallest);
    }
}
