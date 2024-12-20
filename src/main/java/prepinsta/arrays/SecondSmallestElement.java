package prepinsta.arrays;

import java.util.Arrays;

public class SecondSmallestElement {

    public static void main(String[] args) {

        int[] arr = {90,20,30,40,50};
        int smallest  = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;

        for (int i  = 0 ; i<arr.length ; i++)
        {
            if (arr[i] < smallest)
            {
                secSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secSmallest && secSmallest!= smallest) {
                secSmallest = arr[i];
            }
        }
        System.out.println("Second Smallest number is : " + secSmallest);
    }
}
